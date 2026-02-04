package Linkedlist;

public class MiddleAdd {

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

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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

    public static void main(String args[]) {
        MiddleAdd ll = new MiddleAdd();   

        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(3);
        ll.print();

        ll.addFirst(4);
        ll.print();

        ll.add(2, 99);   
        ll.print();
    }
}

// LL is empty
// 1 -> null
// 2 -> 1 -> null
// 3 -> 2 -> 1 -> null
// 4 -> 3 -> 2 -> 1 -> null
// 4 -> 3 -> 99 -> 2 -> 1 -> null
