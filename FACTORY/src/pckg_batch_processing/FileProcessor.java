package pckg_batch_processing;

import java.io.File;

public class FileProcessor {

    private BatchProcessor batchProcessor;

    public FileProcessor(){
        System.out.println("Default processor: '.txt' batch processor");
        this.batchProcessor = new TxtBatchProcessor();
    }

    public void setBatchProcessor(BatchProcessor batchProcessor) {
        this.batchProcessor = batchProcessor;
    }

    public void processFile(File file){
        batchProcessor.processBatch(file);
    }
}
