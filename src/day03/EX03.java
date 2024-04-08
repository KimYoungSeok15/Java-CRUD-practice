package day03;

public class EX03 {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Dog dog = new Dog();
        Cat cat = new Cat();

        garden.getSound(dog);
        garden.getSound(cat);
    }
}

class Garden {
    void getSound(Pet pet) {
//        if (pet instanceof Dog) {
//            System.out.println("멍멍");
//        } else {
//            System.out.println("야옹");
//        }
        pet.cry();
    }
}

abstract class Pet {
    abstract void cry();
}

class Dog extends Pet {
    void cry() {
        System.out.println("멍멍");
    }
}

class Cat extends Pet {
    void cry() {
        System.out.println("야옹");
    }
}