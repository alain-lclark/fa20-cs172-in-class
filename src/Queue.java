public class Queue<E> {

    private Node head;
    private Node tail;

    private class Node {
        private E item;
        private Node next;
    }

    public void enqueue(E item) {
        Node oldTail = tail;
        tail = new Node();
        tail.item = item;
        tail.next = null;
        if (isEmpty()) head = tail;
        else           oldTail.next = tail;
    }

    public E dequeue() {
        assert head != null; // assume well-behaved client code
        E item = head.item;
        head = head.next;
        if (isEmpty()) tail = null;
        return item;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
