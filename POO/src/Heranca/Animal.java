package Heranca;

public class Animal {
    String nome;
    int num_membros;
    String alimento; //Carnívoro, Herbívoro, Onívoro
    String porte; //pequeno, médio, Grande

    Animal(String alimento, int num_membros, String porte){
        this.alimento = alimento;
        this.num_membros = num_membros;
        this.porte = porte;
    }

    Animal(String nome, String alimento, int num_membros, String porte){
        this.nome = nome;
        this(alimento, num_membros, porte);
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void comer(String tipo_comida){
        if(tipo_comida.equals(this.alimento)){
            System.out.println("O animal "+nome+" comeu");
        }else{
            System.out.println("Tipo errado de alimento");
        }
    }

    void dormir(){
        System.out.println("O animal "+ nome +" dormiu. Zzzz....");
    }

    void fazer_barulho(){
        System.out.println("BARULHO");
    }
}
