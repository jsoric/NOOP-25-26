package zad_1_vjezbe;

public class WritingOffice {

    private WriterInt someNovelWriter;

    public WritingOffice(WriterInt someNovelWriter) {
        this.someNovelWriter = someNovelWriter;
    }

    public void writeNovel(int type) {
        someNovelWriter.writeNovel(type);
        System.out.println(this.toString());
    }

    public void setSomeNovelWriter(WriterInt someNovelWriter) {
        this.someNovelWriter = someNovelWriter;
    }

    @Override
    public String toString() {
        return "WritingOffice{" +
                "someNovelWriter=" + someNovelWriter +
                '}';
    }
}
