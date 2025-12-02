package pckg_intro;

import java.io.*;

public class AUX_CLS {

    public static void writeInFile(String text, File file) {
        try(OutputStreamWriter osw = new FileWriter(file)) {
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(text);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeTxtInFileBw(String text, File file) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write2File(String text, File file) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeTxtInFile(String text, File file) {
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))){
            PrintWriter pw = new PrintWriter(bos);
            pw.println(text);
            pw.println("\n");
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
