package aula10;

public class Queue <T>{
    private DoubleLinkedList <T> list;

    public Queue() {
        list = new DoubleLinkedList<>();
    }

    public void enqueue(T data) {
        list.insertLast(data);
    }

    public T dequeue() {
        var first = list.getFirst();
        list.removeFirst();
        return first;
    }

    public T front() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
