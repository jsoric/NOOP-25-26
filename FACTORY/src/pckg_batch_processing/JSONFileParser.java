package pckg_batch_processing;

import jakarta.json.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONFileParser implements FileParser {

    @Override
    public List<Record> parseFile(File file) {
        List<Record> records = new ArrayList<>();
        try(FileReader fileReader = new FileReader(file)){
            JsonReader jsonReader = Json.createReader(fileReader);

            // 1. Read the Root Object
            JsonObject rootObject = jsonReader.readObject();

            // 2. Get the "courses" Array from the root object
            JsonArray courseArray = rootObject.getJsonArray("courses");

            // 3. Iterate over each Course Object in the array
            for (JsonValue courseValue : courseArray) {
                JsonObject courseObject = courseValue.asJsonObject();

                // Get course name and the student array
                // Using safe getString() just in case the course name is missing
                String courseName = courseObject.getString("course_name", "UNSPECIFIED_COURSE");
                JsonArray studentArray = courseObject.getJsonArray("students");

                List<StudentRecord> students = new ArrayList<>();

                // 4. Iterate over each Student Object
                for (JsonValue studentValue : studentArray) {
                    JsonObject studentObject = studentValue.asJsonObject();

                    // 5. Use safe getString() calls to prevent the NullPointerException
                    //    if a student record is missing the 'name' or 'student_id' key.
                    String name = studentObject.getString("name", "Unknown Name");
                    String id = studentObject.getString("student_id", "0000");

                    StudentRecord studentRecord = new StudentRecord(id, name);
                    students.add(studentRecord);
                }

                JSONRecord jsonRecord = new JSONRecord(courseName, students);
                records.add(jsonRecord);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getName());
        } catch (IOException e) {
            System.err.println("I/O error processing file: " + file.getName() + " - " + e.getMessage());
        } catch (JsonException e) {
            // Catches errors if the JSON structure is broken or keys are missing
            System.err.println("JSON Parsing Error in file: " + file.getName() + " - " + e.getMessage());
        }

        return records;
    }
}
