package OOPS;

public class Interface {
    public static void main(String[] args) {
        
        chessPlayer q = new Queen();
        q.move();   // calling method
    }
}

interface chessPlayer {
    void move();
}

class Queen implements chessPlayer {

    public void move() {
        System.out.println("Up, down, left, right, diagonal (in all directions).");
    }
}
