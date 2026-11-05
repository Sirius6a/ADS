package PessoaAgenda;

public class Agenda {
    private Pessoa[] contatos;
    private int posicaoLivre;

    public Agenda() {
        this.contatos = new Pessoa[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Pessoa p) {
        if (posicaoLivre < contatos.length) {
            contatos[posicaoLivre] = p;
            posicaoLivre++;
        } else {
            System.out.println("Agenda cheia! Não é possível adicionar mais contatos.");
        }
    }

    public boolean contemPessoa(int id) {
        for (int i = 0; i < posicaoLivre; i++) {
            if (contatos[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean contemPessoa(String dado) {
        for (int i = 0; i < posicaoLivre; i++) {
            if (contatos[i].getIdentificacao().equals(dado)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarDados() {
        System.out.println("====== DADOS DA AGENDA ======");
        for (int i = 0; i < posicaoLivre; i++) {
            contatos[i].mostrarDados();
            System.out.println("-----------------------------");
        }
    }

}
