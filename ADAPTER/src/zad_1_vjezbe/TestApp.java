package zad_1_vjezbe;

public class TestApp {

    public static void main(String[] args) {
        WritingOffice writingOffice = new WritingOffice(new NovelWriter());
        writingOffice.writeNovel(1);
        writingOffice.writeNovel(2);
        writingOffice.writeNovel(3);
        writingOffice.setSomeNovelWriter(new AdaptSF2WriterInt(new SFNovelist()));
        writingOffice.writeNovel(0);
    }
}
