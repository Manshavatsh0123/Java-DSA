//Polymorphism - a concept where one interface or action can work with different underlying data types or objects.
//Method Overloading - Multiple function with the same name but different parameters(Compile).

package OOPS;
public class Overloading {
    public static void main(String[] args) {
      Calculator calc = new Calculator();
      System.out.println(calc.sum(10,4));
      System.out.println(calc.sum((float)9.6, (float)11.6));//type casting
      System.out.println(calc.sum(2, 3,8));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// 14
// 21.2
// 13