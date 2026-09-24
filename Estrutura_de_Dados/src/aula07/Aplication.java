package aula07;

import aula07.Student;
import aula07.ServiceList;

public class Aplication {
    public static void main(String[] args) {
        ServiceList<Student> fila = new ServiceList<>();

        System.out.println("--- TESTE 1: FILA VAZIA ---");
        fila.exibirTodos();
        fila.removerPrimeiro();

        System.out.println("\n--- TESTE 2: INSERÇÃO ---");
        fila.adicionarNoFim(new Student("Rayane", "202401", 2));
        fila.adicionarNoFim(new Student("Gustavo", "202402", 1));
        fila.adicionarNoInicio(new Student("Mylane", "202403", 3));

        fila.exibirTodos();
        System.out.println("Quantidade em fila: " + fila.quantidadeTotal());

        System.out.println("\n--- TESTE 3: ATENDIMENTO E REMOÇÃO ---");
        Student atendido = fila.removerPrimeiro();
        if (atendido != null) {
            System.out.println("Atendido: " + atendido.name() + " (Matrícula: " + atendido.registration() + ")");
        }

        System.out.println("\nRemovendo Gustavo por desistência...");
        fila.removerElemento(new Student("", "202402", 0));

        fila.exibirTodos();
        System.out.println("Quantidade em fila: " + fila.quantidadeTotal());

        System.out.println("\n--- TESTE 4: BUSCA ---");
        fila.buscarElemento(new Student("", "202401", 0));
        fila.buscarElemento(new Student("", "999999", 0));

        System.out.println("\n--- TESTE 5: INSERÇÃO POR ÍNDICE ---");
        fila.adicionarPorIndice(0, new Student("Isakysom", "202404", 1));
        fila.adicionarPorIndice(1, new Student("Marliane", "202405", 1));
        fila.adicionarPorIndice(50, new Student("Weslei", "999999", 1));

        fila.exibirTodos();
    }
}
