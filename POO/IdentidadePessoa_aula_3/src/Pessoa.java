class Pessoa {
    String nome;
    int idade;
    String cpf;
    float altura;
    float peso;

    Pessoa(String nome, int idade, String cpf, float altura, float peso){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
    }

    void fazer_aniversario(){
        idade += 1;
    }

    void apresentar(){
        System.out.println("Oi, meu nome é "+nome+".");
    }

    void apresentar_idade(){
        System.out.println("Eu tenho "+idade+" anos.");
    }

    void cartorio(String novo_nome){
        nome = novo_nome;
        //System.out.println("Agora me chamo "+novo_nome+" prazer.");
    }

    void Mostrar_dados() {
        System.out.println("Pessoa de nome: "+nome+
                "\nIdade: "+idade+" anos"+
                "\nCPF: "+cpf+
                "\nAltura: "+altura+
                "\nPeso: "+peso);
    }

    String getNome(){
        System.out.println("Qual o seu nome? ");
        return nome;
    }

    void perguntar_nome(Pessoa in){
        String nome_da_pessoa = in.getNome();
        System.out.println("Olá, meu nome é "+nome_da_pessoa);
    }

    Pessoa fazer_minino(Pessoa in) {
        String nome_filho = this.nome + " Junior";
        String cpf_filho = in.cpf + "-000";

        return new Pessoa(nome_filho, 0, cpf_filho, 0.5f, 3.5f);
    }
}
