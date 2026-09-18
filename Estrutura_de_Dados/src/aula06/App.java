package aula06;

public class App {
    import aula06.LinkedList;

    void main() {
        var list = new LinkedList();
        list.insertFirst("a");
        list.insertEnd("b");
        list.insertFirst("c");
        boolean contains = list.contains("c");
        list.removeFirst();
        var node = list.get("a");

        list.print();

    }
}
