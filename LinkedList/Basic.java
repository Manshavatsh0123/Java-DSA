import org.w3c.dom.Node;

public class Basic {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of Linked List
    Node head;

    // Add element at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print Linked List
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Basic ll = new Basic();
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(3);
        ll.print();

        ll.addFirst(4);
        ll.print();
    }
}

// LL is empty
// 1 -> null
// 2 -> 1 -> null
// 3 -> 2 -> 1 -> null
// 4 -> 3 -> 2 -> 1 -> null