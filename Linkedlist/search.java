package Linkedlist;

public class search {

    // creating a node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // head, tail and size
    public static Node head;
    public static Node tail;
    public static int size = 0;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    
   // add at index
    public void add(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print linked list
    public void print() {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public int removeFirst() {
        // linked list is empty
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        // there is only one node in linked list
        else if (size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        // there are more than one node in linked list
         int val = head.data;
         head = head.next;
            size--;
            return val;
    }

    public int removeLast() {
        // linked list is empty
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        // there is only one node in linked list
        else if (size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        // there are more than one node in linked list
         Node temp = head;

         while (temp.next != tail) {
             temp = temp.next;
         }

         int val = tail.data;
         temp.next = null;
         tail = temp;
         size--;
         return val;
    }
    public int search_key(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
        if (temp.data == key) {
            return i;
        }
        temp = temp.next;
        i++;
    }
    // key not found in the list
    
        return -1;
    }



    
    public static void main(String[] args) {

        search ll = new search();

        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(8);
        ll.print();

        ll.addLast(4);
        ll.print();

        ll.addLast(9);
        ll.print();

        ll.add(2, 9);
        ll.print();

        System.out.println("Size of Linked List = " + ll.size);
        ll.removeFirst();
        ll.print();
         System.out.println("Size of Linked List = " + ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.search_key(9));
         System.out.println(ll.search_key(4));
         System.out.println(ll.search_key(10));

    }

}




   