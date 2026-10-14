package Heranca;

public class Main {
    void main() {
        Animal Humano = new Animal("Gustavo", "Onívoro", 4, "Médio");
        Cachorro Bob = new Cachorro("Médio");
        Gato Jorjinho = new Gato("Pequeno");
        Vaca Mimosa = new Vaca("Grande");

        System.out.println("-------- HUMANO --------");
        Humano.comer("Onívoro");
        Humano.fazer_barulho();
        Humano.dormir();

        System.out.println("-------- CACHORRO --------");
        Bob.setNome("Bob");
        Bob.comer("Carne");
        Bob.comer("Vegetal");
        Bob.farejar();
        Bob.fazer_barulho();
        Bob.dormir();

        System.out.println("-------- GATO --------");
        Jorjinho.setNome("Jorjinho");
        Jorjinho.comer("Carne");
        Jorjinho.fazer_barulho();
        Jorjinho.cacar();
        Jorjinho.dormir();

        System.out.println("-------- VACA --------");
        Mimosa.setNome("Mimosa");
        Mimosa.comer("Carne");
        Mimosa.comer("mato");
        Mimosa.Dar_leite();
        Mimosa.dormir();

    }
}
