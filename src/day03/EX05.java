package day03;

public class EX05 {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.play();
        netflix.finish();

        System.out.println();

        Tving tving = new Tving();
        tving.play();
        tving.finish();
    }
}

abstract class OTT {
    abstract void printOpeningLogo();

    void play() {
        printOpeningLogo();
        System.out.println("영상 시작");
    }

    void finish() {
        System.out.println("다 봤다~");
    }
}

class Netflix extends OTT {
    @Override
    void printOpeningLogo() {
        System.out.println("Netflix");
    }
}

class Tving extends OTT {
    @Override
    void printOpeningLogo() {
        System.out.println("Tving");
    }
}