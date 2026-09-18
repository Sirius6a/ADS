package aula06;

public class LinkedList {
    Node head;

    private static class Node {
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
        }
    }

    public void insertFirst(String data) {
        var newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertEnd(String data) {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        var currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public boolean contains(String data) {
        if (head == null) {
            return false;
        }
        var temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node get(String data) {
        // TODO
    }

    public void removeEnd() {
        if (head == null) return;
        var temp = head;
        var currentNode = temp.next;
        while (currentNode != null && currentNode.next != null) {
            temp = currentNode;
            currentNode = temp.next;
        }
        temp.next = null;
    }

    public void print() {
        var temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}