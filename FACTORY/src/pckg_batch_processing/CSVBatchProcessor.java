package pckg_batch_processing;

public class CSVBatchProcessor extends BatchProcessor {
    @Override
    protected FileParser createFileParser() {
        return new CSVFileParser();
    }

    @Override
    protected void processRecords() {
        for(Record record : records) {
            System.out.println(record);
        }
    }

    @Override
    protected void writeSummary() {
        System.out.println("Total number of records: " + records.size());
        System.out.println("Type of record: " + (records.isEmpty() ? "N/A" : records.get(0).getClass().getSimpleName()));
    }
}
