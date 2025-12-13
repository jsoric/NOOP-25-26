package pckg_batch_processing;

import java.io.File;

public class AppTest {

    public static void main(String[] args) {

        File txtFile = new File("FACTORY/src/pckg_batch_processing/data.txt");
        File csvFile = new File("FACTORY/src/pckg_batch_processing/data.csv");
        File jsonFile = new File("FACTORY/src/pckg_batch_processing/data.json");

        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile(txtFile);

        fileProcessor.setBatchProcessor(new CSVBatchProcessor());
        fileProcessor.processFile(csvFile);

        fileProcessor.setBatchProcessor(new JSONBatchProcessor());
        fileProcessor.processFile(jsonFile);
    }
}
