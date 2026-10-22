package aula08;

public class AppAula08 {
    void main() {
        // duplamnete encadeada
        var n1 = new Node(10);
        var n2 = new Node(20);
        var n3 = new Node(30);
        n1.next = n2;
        n2.previous = n1;
        n2.next = n3;
        n3.previous = n2;

        // arvore
        var x1 = new Node(10);
        var x2 = new Node(20);
        var x3 = new Node(30);
        x1.previous = x2; // previous == left
        x1.next = x3; // next == right

        var a = new Node(8);
        var b = new Node(80);
        a.next = b;
        b.next = a;
        var current = a;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
