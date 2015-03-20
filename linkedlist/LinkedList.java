public class LinkedList {
    private Node head;
    private int size;

    private class Node {
        private int val;
        private Node next;

        public Node(int i, Node n) {
            val = i;
            next = n;
        }
    }

    public LinkedList() {
        head = new Node(Integer.MIN_VALUE, null); // sentinel node
        size = 0;
    }

    public LinkedList(int i) {
        head = new Node(Integer.MIN_VALUE, null); // sentinel node
        head.next = new Node(i, null);
        size = 1;
    }

    public void insertFront(int i) {    
        head.next = new Node(i, head.next);
        size += 1;
    }

    public int getFront() {
        if (head.next != null) {
            return head.next.val;
        } else {
            throw new NullPointerException("No front found.");
        }
    }

    public void insertBack(int i) {
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new Node(i, null);
        size += 1;
    }

    public void printList() {
        Node ptr = head.next;
        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }

    public int size() {
        return size;
    }

    

}