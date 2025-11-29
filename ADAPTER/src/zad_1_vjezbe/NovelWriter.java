package zad_1_vjezbe;

public class NovelWriter implements WriterInt{
    @Override
    public void writeNovel(int novelType) {
        switch (novelType) {
            case 1:
                System.out.println("Writing romantic novel");break;
            case 2:
                System.out.println("Writing dramatic novel");break;
            case 3:
                System.out.println("Writing history novel");break;
            default:
                throw new IllegalArgumentException("Invalid novel type");
        }
    }

    @Override
    public String toString() {
        return "NovelWriter";
    }
}
