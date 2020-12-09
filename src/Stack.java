public class Stack<E> {

    Node top;

    private class Node {
        E item;
        Node next;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(E item) {
        Node oldTop = top;
        top = new Node();
        top.item = item;
        top.next = oldTop;
    }

    public E pop() {
        E item = top.item;
        top = top.next;
        return item;
    }

}
