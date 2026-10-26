package aula10;

public class DoubleLinkedList<T> {
    private int size;
    private Node first;
    private Node last;

    public DoubleLinkedList() {
        size = 0;
    }

    private class Node {
        Node prev;
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
        public Node(Node prev, T data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(T data) {
        var newNode = new Node(data);

        if (first == null) {
            last = newNode;

        }else {
            newNode.next = first;
            first.prev = newNode;

        }
        first = newNode;
        size++;
    }
    public void insertLast(T data) {
        var newNode = new Node(data);

        if (first == null) {
            first = newNode;

        }else {
            newNode.prev = last;
            last.next = newNode;
        }
        last = newNode;
        size++;
    }
    // imprimir do início até o final
    public void print() {
        if (size == 0) {
            System.out.println("A lista esta vazia");
            return;
        }else {
            var current = first;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    // imprimir do fim até o início (inversa)
    public void printReverse() {
        if (size == 0) {
            System.out.println("A lista esta vazia");
            return;
        }else {
            var current = last;

            while (current != null) {
                System.out.println(current.data);
                current = current.prev;
            }
        }
    }
    // remover um elemento do início
    public void removeFirst() {
        if (size == 0) {
            return;
        }

        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        size--;
    }
    // remover um elemento do final
    public void removeLast() {
        if (size == 0) {
            return;
        }

        if (last == first) {
            last = null;
            first = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        size--;
    }
    // retornar o dado do primeiro elemento
    public T getFirst() {
        if (size == 0) {
            return null;
        }

        return first.data;
    }
    // retornar o dado do último elemento
    public T getLast() {
        if (size == 0) {
            return null;
        }
        return last.data;
    }
    // retornar o tamanho da lista
    public int size() {
        return size;
    }
}

