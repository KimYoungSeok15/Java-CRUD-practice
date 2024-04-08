package day03;

public class EX04 {
    public static void main(String[] args) {
        Pastaaaaaaa pastaReceipt = new Pastaaaaaaa("이연복");
    }
}

abstract class Receipt {
    String name;

    Receipt(String name) {
        this.name = name;

    }
    void getInfo() {
        System.out.println("이 레시피는 "
                + name + "쉐프님의 레시피입니다.");
    }
}

class Pastaaaaaaa extends Receipt {

    Pastaaaaaaa(String name) {
        super(name);
    }

    void makeSource() {
        System.out.println("소스를 맛있게 만들어요");
    }
}

class SteakReceipt extends Receipt {

    SteakReceipt(String name) {
        super(name);
    }

    void grillSteak() {
        System.out.println("스테이크를 맛있게 굽는다");
    }
}