package Heranca;

public class Vaca extends Animal{

    Vaca(String alimento, int num_membros, String porte) {
        super(alimento, num_membros, porte);
    }

    Vaca(String porte) {
        super("mato", 4, porte);
    }

    @Override
    void fazer_barulho() {
        System.out.println("Muuu muuu");
    }

    void Dar_leite() {
        System.out.println("A vaca "+ nome +" deu leite");
    }
}
