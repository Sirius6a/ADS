package aula06;

public class FilaAtendimento {
    private LinkedList lista = new LinkedList();

    public void adicionarAlunoNoFim(Aluno aluno) {
        lista.insertEnd(aluno);
    }

    public void adicionarAlunoNoInicio(Aluno aluno) {
        lista.insertFirst(aluno);
    }

    public void adicionarAlunoPorIndice(int indice, Aluno aluno) {
        try {
            lista.insertAt(indice, aluno);
            System.out.println("Aluno " + aluno.getNome() + " inserido na posição [" + indice + "] da fila.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Posição " + indice + " é inválida para a fila atual (Tamanho: " + lista.size() + ").");
        }
    }


    public void atenderProximo() {
        if (lista.isEmpty()) {
            System.out.println("Fila vazia! Nenhum aluno para atender.");
            return;
        }
        Aluno atendido = lista.removeFirst();
        System.out.println("Atendendo: " + atendido.getNome() + " (Matrícula: " + atendido.getMatricula() + ")");
    }

    public void removerAluno(String matricula) {
        boolean removido = lista.remove(matricula);
        if (removido) {
            System.out.println("Aluno com matrícula " + matricula + " foi removido da fila.");
        } else {
            System.out.println("Erro: Aluno com matrícula " + matricula + " não foi encontrado.");
        }
    }

    public void buscarAluno(String matricula) {
        Aluno aluno = lista.search(matricula);
        if (aluno != null) {
            System.out.println("Aluno encontrado: " + aluno);
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não está na fila.");
        }
    }

    public void listarAlunos() {
        if (lista.isEmpty()) {
            System.out.println("A fila está vazia no momento.");
            return;
        }
        lista.print();
    }

    public int quantidadeAlunos() {
        return lista.size();
    }
}
