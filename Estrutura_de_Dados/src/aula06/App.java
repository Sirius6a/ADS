package aula06;

import aula06.LinkedList;

public class App {
    void main() {
        var list = new LinkedList();
        list.insertFirst("a");
        list.insertEnd("b");
        list.insertFirst("c");
        list.insertEnd("d");
        list.insertEnd("e");
        //boolean contains = list.contains("c");
        //list.removeFirst();
        var node = list.get("d"); // só consigo ver o next no debug
        System.out.println("Lista: ");
        list.print();
        System.out.println("Valor do get e seus nexts");
        list.print(node); // printa na tela os dados do metodo get
    }
}