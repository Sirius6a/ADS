package aula06;

public class Aluno {
    String nome;
    String matricula;
    int prioridade;

    Aluno (String nome, String matricula, int prioridade) {
        this.nome = nome;
        this.matricula = matricula;
        this.prioridade = prioridade;
    }

    public String toString() {
        return nome + matricula + prioridade;
    }

    // --- GETTERS E SETTERS ---

    // Getter para o Nome (permite ler o nome)
    public String getNome() {
        return nome;
    }

    // Setter para o Nome (permite alterar o nome)
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a Matrícula
    public String getMatricula() {
        return matricula;
    }

    // Setter para a Matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter para a Prioridade
    public int getPrioridade() {
        return prioridade;
    }

    // Setter para a Prioridade
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}

