package aula09;

public class AppAula09 {
    void main() {
        var list = new DoubleLinkedList<>();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(1988);

        System.out.println("Primeiro elemento: " + list.getFirst());
        System.out.println("Último elemento: " + list.getLast());
        System.out.println("Tamanho da lista: " + list.size());

        System.out.println("----- Lista em ordem -----");
        list.print();
        System.out.println("--------------------------");
        System.out.println("----- Lista reversa -----");
        list.printReverse();
        System.out.println("-------------------------");

        System.out.println("--- Remove o primeiro ---");
        list.removeFirst();
        list.print();
        System.out.println("-------------------------");

        System.out.println("--- Remove o ultimo ---");
        list.insertFirst(20);
        list.removeLast();
        list.print();
        System.out.println("-----------------------");

    }

}
