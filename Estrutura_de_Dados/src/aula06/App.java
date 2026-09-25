package aula06;

public class App {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();

        System.out.println("--- TESTE 1: FILA VAZIA ---");
        fila.listarAlunos();
        fila.atenderProximo();

        System.out.println("\n--- TESTE 2: INSERÇÃO ---");
        fila.adicionarAlunoNoFim(new Aluno("Marliane", "000001", 2));
        fila.adicionarAlunoNoFim(new Aluno("Antonio", "000002", 1));
        fila.adicionarAlunoNoInicio(new Aluno("Rayane", "000003", 3));
        fila.adicionarAlunoNoInicio(new Aluno("Mylane", "000004", 3));
        fila.adicionarAlunoNoFim(new Aluno("Marcos", "000008", 3));

        fila.listarAlunos();
        System.out.println("Quantidade em fila: " + fila.quantidadeAlunos());

        System.out.println("\n--- TESTE 3: ATENDIMENTO E REMOÇÃO ---");
        fila.atenderProximo();
        fila.atenderUltimo();

        System.out.println("\nRemovendo Antonio por desistência...");
        fila.removerAluno("000002");

        fila.listarAlunos();
        System.out.println("Quantidade em fila: " + fila.quantidadeAlunos());

        System.out.println("\n--- TESTE 4: BUSCA ---");
        fila.buscarAluno("000001");
        fila.buscarAluno("000002");

        System.out.println("\n--- TESTE 5: INSERÇÃO POR ÍNDICE ---");
        fila.adicionarAlunoPorIndice(0, new Aluno("Gustavo", "000005", 1));
        fila.adicionarAlunoPorIndice(1, new Aluno("Isakysom", "000006", 1));
        fila.adicionarAlunoPorIndice(50, new Aluno("Weslei", "000007", 1));

        fila.listarAlunos();

        System.out.println("\n--- TESTE 6: VERIFICANDO SE TÁ NA FILA ---");
        Aluno alunoNaFila = new Aluno("Marliane", "000001", 2);
        Aluno alunoForaDaFila = new Aluno("Pedro", "000009", 1);

        System.out.println("Testando aluno que DEVE estar na fila:");
        fila.TaNaFila(alunoNaFila);

        System.out.println("\nTestando aluno que NÃO DEVE estar na fila:");
        fila.TaNaFila(alunoForaDaFila);



    }
}
