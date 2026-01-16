//Static keyword : is used to share the same variable or method of a given class.

package OOPS;
public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.School = "St Paul's School";

        Student s2 = new Student();
        System.out.println(s2.School);
    }
}

class Student{
    String name;
    int roll;

    static String School; //Static Keyword

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
