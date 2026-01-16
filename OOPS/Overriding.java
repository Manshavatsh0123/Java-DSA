//Method Overriding : Parent and child both contain the same function with a different definition.

package OOPS;

public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eat something");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}
