package TCSNQT;


public class LLRemove {
    public static class node{
        int data;
        node next;
        public node (int data){
            this.data = data;
            this.next= null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public static void addfirst(int data){
        node newNode = new node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if(size == 1){
            head = tail = null;
        } else {
            head = head.next;
        }
        size --;
        return val;
        
    }
    public static void main(String[] args){
        LLRemove ll = new LLRemove();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);


        while(ll.size > 0){
            System.out.println(ll.removeFirst());
        }
    }
}
