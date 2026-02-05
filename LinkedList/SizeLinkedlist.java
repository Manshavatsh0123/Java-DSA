package Linkedlist;

public class SizeLinkedlist {

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
    int size = 0; // Track size

    // Add element at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add element at index
    public void add(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Get size of Linked List
    public int getSize() {
        return size;
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

    // Main method
    public static void main(String args[]) {
        SizeLinkedlist list = new SizeLinkedlist();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.add(1, 5); // Insert at index 1

        list.print();
        System.out.println("Size of Linked List: " + list.getSize());
    }
}

// 1 -> 5 -> 2 -> 3 -> null
// Size of Linked List: 4