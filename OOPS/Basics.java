//OOPS(Object Oriented Programmings) - a programming paradigm that is the backbone of Java and focuses on using objects and classes to design software.
//Object: A real-world instance of a class with its own identity, state, and behavior. 

package OOPS;
public class Basics {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Color : "+p1.color);
        p1.setTip(5);
        System.out.println("Tip : "+p1.tip);
    }
}

//Class: A blueprint defining properties and behaviors for objects.
class Pen {
    String color;
    int tip;

    // function
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

//Color : Blue
//Tip : 5
