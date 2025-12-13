package pckg_batch_processing;

public record StudentRecord(String id, String name) {

    @Override
    public String toString() {
        return "StudentRecord{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
