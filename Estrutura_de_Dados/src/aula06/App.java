package aula06;

public class App {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();

        System.out.println("--- TESTE 1: FILA VAZIA ---");
        fila.listarAlunos();
        fila.atenderProximo();

        System.out.println("\n--- TESTE 2: INSERÇÃO ---");
        fila.adicionarAlunoNoFim(new Aluno("Ana", "202401", 2));
        fila.adicionarAlunoNoFim(new Aluno("Bruno", "202402", 1));
        // Carla entra direto no início da fila
        fila.adicionarAlunoNoInicio(new Aluno("Carla", "202403", 3));

        System.out.println("Fila atual:");
        fila.listarAlunos();
        System.out.println("Quantidade em fila: " + fila.quantidadeAlunos());

        System.out.println("\n--- TESTE 3: ATENDIMENTO E REMOÇÃO ---");
        fila.atenderProximo(); // Deve atender a Carla (primeira da fila)

        System.out.println("\nRemovendo Bruno por desistência...");
        fila.removerAluno("202402"); // Remove o Bruno do meio/fim da fila

        System.out.println("\nFila resultante:");
        fila.listarAlunos(); // Deve sobrar apenas a Ana
        System.out.println("Quantidade em fila: " + fila.quantidadeAlunos());

        System.out.println("\n--- TESTE 4: BUSCA ---");
        fila.buscarAluno("202401"); // Deve achar a Ana
        fila.buscarAluno("999999"); // Teste de aluno inexistente

        System.out.println("\n--- TESTE 5: INSERÇÃO POR ÍNDICE ---");
        fila.adicionarAlunoPorIndice(0, new Aluno("Daniel", "202404", 1));
        fila.adicionarAlunoPorIndice(1, new Aluno("Eduardo", "202405", 1));
        fila.adicionarAlunoPorIndice(50, new Aluno("Invalido", "999999", 1));

        System.out.println("\nFila após inserções por índice:");
        fila.listarAlunos();

    }
}
