package day03;

public class EX01 {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Chicken chicken = new Chicken();

        Farm farm = new Farm(cow, chicken);
        farm.getSound();
    }
}

class Farm {
    Cow cow;
    Chicken chicken;

    Farm(Cow cow, Chicken chicken) {
        this.cow = cow;
        this.chicken = chicken;
    }

//    void 먹이를_준다() {
//        cow.eat();
//        chicken.eat();
//    }

    void getSound() {
        cow.cry();
        chicken.cry();
    }
}

class Animal {
    void cry() {

    }
}

class Cow extends Animal{
    @Override
    void cry() {
        System.out.println("음메");
    }
}

class Chicken extends Animal{
    void cry() {
        System.out.println("꼬끼오");
    }
}