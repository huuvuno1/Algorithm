package data_structures;

public class LinkedList<E> implements Collection<E> {
    private Node head;
    private Node tail;
    private int size;

    public void add(E data) {
        if (data == null)
            throw new IllegalArgumentException("Null element is not allowed!");
        if (head == null) {
            head = tail = new Node();
            head.data = data;
        }
        else {
            Node newNode = new Node();
            newNode.data = data;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void remove(E element) {
        if (head != null && head.data.equals(element)) {
            head = head.next;
            return;
        }
        Node p = head;
        while (p != null) {
            Node temp = p.next;
            if (temp != null && temp.data.equals(element)) {
                p.next = temp.next == null ? null : temp.next;
                return;
            }
            p = p.next;
        }
    }

    @Override
    public void removeAll(E element) {
        while (head != null && head.data.equals(element)) {
            head = head.next;
        }
        Node p = head;
        while (p != null) {
            Node temp = p.next;
            if (temp != null && temp.data.equals(element)) {
                p.next = temp.next == null ? null : temp.next;
            }
            else
                p = p.next;
        }
    }

    class Node {
        private E data;
        private Node next;
    }

    @Override
    public void forEach(Consumer<E> consumer) {
        Node p = head;
        while (p != null) {
            consumer.action(p.data);
            p = p.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E element) {
        Node p = head;
        while (p != null) {
            if (p.data.equals(element))
                return true;
            p = p.next;
        }
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
    }
}