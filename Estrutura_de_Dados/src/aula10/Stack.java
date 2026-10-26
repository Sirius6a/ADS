package aula10;

public class Stack <T> {
    private DoubleLinkedList <T> list;

    public Stack() {
        list = new DoubleLinkedList<>();
    }

    public void push(T data) {
        list.insertLast(data);
    }

    public T pop() {
        var last = list.getLast();
        list.removeLast();
        return last;
    }

    public T peek() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}