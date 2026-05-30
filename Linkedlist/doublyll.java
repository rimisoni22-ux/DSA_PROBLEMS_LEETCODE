public class doublyll {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // add first
    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // remove first
    public int removefirst() {

        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return val;
    }

    public static void main(String[] args) {

        doublyll dll = new doublyll();

        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);

        dll.print();

        System.out.println("Removed: " + dll.removefirst());

        dll.print();

        System.out.println("Size = " + dll.size);
    }
}