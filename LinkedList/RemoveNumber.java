package Linkedlist;

public class RemoveNumber {

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

    // Remove first element
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        head = head.next; // move head forward
        size--;
        return val;
    }

    // Get size of linked list
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

    public static void main(String[] args) {
        RemoveNumber list = new RemoveNumber();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.add(1, 5);

        list.print();

        System.out.println("Removed: " + list.removeFirst());
        list.print();

        System.out.println("Size of Linked List: " + list.getSize());
    }
}

// 1 -> 5 -> 2 -> 3 -> null
// Removed: 1
// 5 -> 2 -> 3 -> null
// Size of Linked List: 3
