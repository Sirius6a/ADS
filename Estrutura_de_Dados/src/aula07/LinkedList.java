package aula07;

public class LinkedList<T> {
    private Node head;
    private int total_elementos = 0;

    private class Node {
        T data  ;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        return total_elementos;
    }

    public void insertFirst(T data) {
        var newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        total_elementos++;
    }

    public void insertEnd(T data) {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            total_elementos++;
            return;
        }
        var temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        total_elementos++;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        T removido = head.data;
        head = head.next;
        total_elementos--;
        return removido;
    }

    public void removeEnd() {
        if (isEmpty()) return;

        if (head.next == null) {
            head = null;
            total_elementos--;
            return;
        }

        var temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        total_elementos--;
    }

    public boolean contains(T data) {
        if (isEmpty()) return false;
        var temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private Node get(T data) {
        if (isEmpty()) return null;
        var temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public T search(T data) {
        Node no = get(data);
        return (no != null) ? no.data : null;
    }

    // Remove um aluno específico de qualquer lugar da fila pela matrícula
    public boolean remove(T data) {
        if (isEmpty()) return false;

        if (head.data.equals(data)) {
            head = head.next;
            total_elementos--;
            return true;
        }

        var temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(data)) {
                temp.next = temp.next.next; // "Pula" o nó removido
                total_elementos--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void insertAt(int index, T data) {
        if (index < 0 || index > total_elementos) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            insertFirst(data);
            return;
        }

        var newNode = new Node(data);
        var temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        total_elementos++;
    }

    public void print() {
        var temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private void print(Node n){
        var temp = n;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}