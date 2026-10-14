package Heranca;

public class Cachorro extends Animal{

    Cachorro(String alimento, int num_membros, String porte) {
        super(alimento, num_membros, porte);
    }

    Cachorro(String porte){
        super("Carne", 4, porte);
    }

    @Override
    void fazer_barulho() {
        System.out.println("Au au! Hoof hoof!");
    }

    void farejar(){
        System.out.println("Sniff sniff");
    }
}

