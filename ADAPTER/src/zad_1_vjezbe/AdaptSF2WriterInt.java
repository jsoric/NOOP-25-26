package zad_1_vjezbe;

public class AdaptSF2WriterInt implements WriterInt{

    private OldWriterInt sfNovelist;

    public AdaptSF2WriterInt(OldWriterInt novelist) {
        this.sfNovelist = novelist;
    }

    @Override
    public void writeNovel(int novelType) {
        sfNovelist.writeNovelOldFashionStyle();
    }

    @Override
    public String toString() {
        return "AdaptSF2WriterInt{" +
                "sfNovelist=" + sfNovelist +
                '}';
    }
}
