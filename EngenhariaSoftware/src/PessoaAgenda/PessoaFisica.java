package PessoaAgenda;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private int anoNascimento;

    PessoaFisica(int id, String nome, String endereco, String cpf, int anoNascimento) {
        super(id, nome, endereco);
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public int calcularIdade() {
        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;
        return idade;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); // Chama o ID, Nome, Endereço e Meios de Contato da classe Pessoa
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade (em 2026): " + calcularIdade() + " anos");
    }

    public String getIdentificacao() {
        return cpf;
    }

}
