package aula06;

import aula06.LinkedList;

public class App {
    void main() {
        var list = new LinkedList();
        list.insertFirst("a");
        list.insertEnd("b");
        list.insertFirst("c");
        //boolean contains = list.contains("c");
        //list.removeFirst();
        var node = list.get("c"); // só consigo ver o next no debug

        //list.print();
    }
}