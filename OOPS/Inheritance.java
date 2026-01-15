package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

//Multi Level Inheritance

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

class Mammel extends Animal {
    int legs;
}

class Dog extends Mammel {
    String breed;
}

//4
