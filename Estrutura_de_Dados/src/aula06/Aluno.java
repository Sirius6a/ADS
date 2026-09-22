package aula06;

public class Aluno {
    // Atributos privados para garantir o encapsulamento
    private String nome;
    private String matricula;
    private int prioridade;

    // Construtor
    public Aluno(String nome, String matricula, int prioridade) {
        this.nome = nome;
        this.matricula = matricula;
        this.prioridade = prioridade;
    }

    // toString formatado de forma legível
    @Override
    public String toString() {
        return nome + " - " + matricula + " - prioridade " + prioridade;
    }

    // --- GETTERS E SETTERS ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
