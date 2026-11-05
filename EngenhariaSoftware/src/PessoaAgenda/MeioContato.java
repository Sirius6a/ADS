package PessoaAgenda;

public class MeioContato {
    private String tipo;
    private String descricao;

    MeioContato(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }
}
