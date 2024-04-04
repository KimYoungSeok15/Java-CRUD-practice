package day02;

public class EX01 {
    public static void main(String[] args){
        Animal cow = new Animal("누렁이", "음메");
        System.out.println(cow.name);
        cow.cry();
        Animal dog = new Animal("바둑이", "멍멍");
        dog.cry();
    }
}

class Animal {

    String name;
    String sound;

    Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    void cry(){
        System.out.println("엉엉");
    }
}

// 동물 클래스
// 이름(생성자, 필드)
// 메소드: 엉엉