package PessoaAgenda;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeFantasia;

    PessoaJuridica(int id, String nome, String endereco, String cnpj, String nomeFantasia) {
        super(id, nome, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("CNPJ: " +this.cnpj);
        System.out.println("Nome da Empresa: " + this.nomeFantasia);
    }

    public String getIdentificacao() {
        return cnpj;
    }
}
