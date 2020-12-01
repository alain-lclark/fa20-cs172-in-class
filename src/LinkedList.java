public class LinkedList implements List {

    private class Node {
        String item;
        Node next;

        public Node(String item) {
            this.item = item;
            next = null;
        }
    }

    Node head;

    public LinkedList() {
        head = null;
    }

    @Override
    public String get(int index) {
        Node n = head;
        for (int i = 0; i < index; ++i) {
            n = n.next;
        }
        return n.item;
    }

    @Override
    public void add(String item) {
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

}
