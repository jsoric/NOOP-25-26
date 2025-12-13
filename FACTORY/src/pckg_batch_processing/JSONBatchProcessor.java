package pckg_batch_processing;

public class JSONBatchProcessor extends BatchProcessor {
    @Override
    protected FileParser createFileParser() {
        return new JSONFileParser();
    }

    @Override
    protected void processRecords() {
        for(Record record : records) {
            System.out.println(record);
        }
    }

    @Override
    protected void writeSummary() {
        System.out.println("Total number of records in a file: " + records.size());
        System.out.println("Type of record in a file: " + (records.isEmpty() ? "N/A" : records.get(0).getClass().getSimpleName()));
    }
}
