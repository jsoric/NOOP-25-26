package pckg_batch_processing;

import java.util.List;

public record JSONRecord(String courseName, List<StudentRecord> students) {

    @Override
    public String toString() {
        return "JSONRecord{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students +
                '}';
    }
}
