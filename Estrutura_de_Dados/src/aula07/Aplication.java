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
        fila.adicionarNoFim(new Student("Rayane", "000001", 2));
        fila.adicionarNoFim(new Student("Gustavo", "000002", 1));
        fila.adicionarNoInicio(new Student("Mylane", "000003", 3));

        fila.exibirTodos();
        System.out.println("Quantidade em fila: " + fila.quantidadeTotal());

        System.out.println("\n--- TESTE 3: ATENDIMENTO E REMOÇÃO ---");
        Student atendido = fila.removerPrimeiro();
        if (atendido != null) {
            System.out.println("Atendido: " + atendido.name() + " (Matrícula: " + atendido.registration() + ")");
        }

        System.out.println("\nRemovendo Gustavo por desistência...");
        fila.removerElemento(new Student("", "000002", 0));

        fila.exibirTodos();
        System.out.println("Quantidade em fila: " + fila.quantidadeTotal());

        System.out.println("\n--- TESTE 4: BUSCA ---");
        fila.buscarElemento(new Student("", "000001", 0));
        fila.buscarElemento(new Student("", "000002", 0));

        System.out.println("\n--- TESTE 5: INSERÇÃO POR ÍNDICE ---");
        fila.adicionarPorIndice(0, new Student("Isakysom", "000004", 1));
        fila.adicionarPorIndice(1, new Student("Marliane", "000005", 1));
        fila.adicionarPorIndice(2, new Student("Gustavo", "000008", 2));
        fila.adicionarPorIndice(50, new Student("Weslei", "000009", 1));

        fila.exibirTodos();

//        System.out.println("\n--- NOVA FILA ---\n");
//
//        ServiceList<Teacher> mesa = new ServiceList<>();
//
//        System.out.println("--- TESTE 1: MESA VAZIA ---");
//        mesa.exibirTodos();
//        mesa.removerPrimeiro();
//
//        System.out.println("\n--- TESTE 2: SENTANDO A MESA ---");
//        mesa.adicionarNoInicio(new Teacher("Thiago", "ED", "Presta muita atenção!"));
//        mesa.adicionarNoFim(new Teacher("Jefferson", "POO", "A verdade é essa!"));
//        mesa.adicionarNoInicio(new Teacher("Ale", "REDES", "Bora meu povo!"));
//
//        mesa.exibirTodos();
//
//        System.out.println("\n--- TESTE 3: ATENDIMENTO E REMOÇÃO ---");
    }
}
