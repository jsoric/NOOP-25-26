package zad_1_vjezbe;

public class SFNovelist implements OldWriterInt {
    @Override
    public void writeNovelOldFashionStyle() {
        System.out.println("Writing SF novel!");
    }

    public SFNovelist() {
        System.out.println("SF novelist created!");
    }


    @Override
    public String toString() {
        return "SFNovelist";
    }
}
