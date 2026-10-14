package Heranca;

public class Gato extends Animal{
    int vidas;
    Gato(String porte) {
        super("Carne", 4, porte);
        this.vidas = 7;
    }

    @Override
    void fazer_barulho() {
        System.out.println("Miau miau");
    }

    void cacar(){
        System.out.println("O gato "+nome+" foi caçar");
        this.comer("Carne");
    }
}

