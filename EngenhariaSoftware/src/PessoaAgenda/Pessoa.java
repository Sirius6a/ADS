package PessoaAgenda;

public class Pessoa {
    protected int id;
    protected String nome;
    protected String endereco;
    private MeioContato[] meioContato;
    private int QtdContatos;

    Pessoa(int id, String nome, String endereco){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.meioContato = new MeioContato[5];
        this.QtdContatos = 0;
    }

    public void adicionar(MeioContato contato){
        if (QtdContatos < meioContato.length) {
            meioContato[QtdContatos] = contato;
            QtdContatos++;
        } else {
            System.out.println("Limite de meios de contato atingido para esta pessoa.");
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("--- Meios de Contato ---");
        if (QtdContatos == 0) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (int i = 0; i < QtdContatos; i++) {
                System.out.println(meioContato[i].getTipo() + ": " + meioContato[i].getDescricao());
            }
        }
    }

    public String getIdentificacao() {
        return nome;
    }
}
