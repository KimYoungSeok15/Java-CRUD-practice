package day02;

import java.util.Objects;

public class Mini_Assignment {
    public static void main(String[] arg) {
        Shop shop = new Shop();
        System.out.println(arg.length);
        Person heungmin = new Person();
        heungmin.setName("heungmin");
        heungmin.setLanguage("Korean");

        Person beckham = new Person();
        beckham.setName("beckham");
        beckham.setLanguage("English");

        heungmin.buyPhone(shop);
        beckham.buyPhone(shop);

        heungmin.setSentence("야 내 핸드폰 켜볼게.");
        beckham.setSentence("I will turn on mine too.");

        heungmin.turnOn();
        beckham.turnOn();

    }
}

class Shop{
    Shop(){
    }
    Phone sell(String language){
        return new Phone(language);
    }
}

class Person{
    String name;
    String sentence;
    String language;
    Phone phone;
    Person(){
    }
    void setName(String name){
        this.name = name;
    }
    void setSentence(String sentence){
        this.sentence = sentence;
    }
    void setLanguage(String language){
        this.language = language;
    }
    void buyPhone(Shop shop){
        this.phone = shop.sell(this.language);
    }
    void turnOn(){
        System.out.println(this.sentence);
        this.phone.start();
    }
}

class Phone {
    String sound;
    Phone(String language){
        if (Objects.equals(language, "English")){
            this.sound = "Beap!";
        } else {
            this.sound = "삐비빅";
        }
    }
    void setSound(String sound){
        this.sound = sound;
    }

    void start(){
        System.out.println(this.sound);
    }
}