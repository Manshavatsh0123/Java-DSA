package OOPS;

public class BankData {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username="Mansha";
        System.out.println(myAcc.getUsername());
        myAcc.setPassword("1233455678");
        System.out.println(myAcc.getPassword());
    }
}

class BankAccount{
    String username;
    String password;
    //Getters : to return the value.
    String getUsername(){
        return this.username; // this - this keywords is used to refer to the current object.
    }

    String getPassword(){
        return this.password;
    }
    //Setters : to modify the value.
    void setUsername(String name){
        this.username = name;
    }

    void setPassword(String pwd){
        this.password = pwd;
    }
}

// Mansha
// 1233455678
