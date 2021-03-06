import java.util.Iterator;

public class LinkedList<E> implements List<E> {

    private class Node {
        E item;
        Node next;

        public Node(E item) {
            this.item = item;
            next = null;
        }
    }

    Node head;

    public LinkedList() {
        head = null;
    }

    @Override
    public E get(int index) {
        Node n = head;
        for (int i = 0; i < index; ++i) {
            n = n.next;
        }
        return n.item;
    }

    @Override
    public void add(E item) {
        Node n = new Node(item);
        if (head == null) {
            head = n;
        }
        else {
            assert head != null;
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            assert i.next == null;
            i.next = n;
        }
    }

    @Override
    public void removeAt(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        Node n = head;
        Node p = null;
        for (int i = 0; i < index; ++i) {
            p = n;
            n = n.next;
            assert p.next == n;
        }
        assert p != null;
        p.next = n.next;
    }

    @Override
    public int size() {
        int size = 0;
        Node n = head;
        while (n != null) {
            ++size;
            n = n.next;
        }
        return size;
    }

    @Override
    public String toString() {
        String s = "[";
        Node n = head;
        while (n != null) {
            s += "\"" + n.item + "\", ";
            n = n.next;
        }
        s += "]";
        return s;
    }

    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {

        Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            E item = current.item;
            current = current.next;
            return item;
        }

    }

}
