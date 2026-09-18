package Baralho_do_Weslei;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    ArrayList<Carta> deck;
    ArrayList<Carta> descarte;

    Baralho(){
        deck = new ArrayList<>();
        descarte = new ArrayList<>();
    }

    Baralho(String pronto){
        deck = new ArrayList<>();
        descarte = new ArrayList<>();
        if(pronto.equals("sim")){
            this.gerar_baralho();
            this.embaralhar();
        }
    }


    void gerar_baralho(){
        String[] naipes = {"copas", "ouros", "Paus", "espadas"};
        for (String naipe:naipes){
            gerar_naipe(naipe);
        }
    }

    void gerar_naipe(String naipe){
        for (int i=1; i<14; i++){
            String valor = ""+i;
            if (i == 1){valor = "A";}
            if (i == 11){valor = "J";}
            if (i == 12){valor = "Q";}
            if (i == 13){valor = "K";}

            deck.add(new Carta(valor, naipe));
        }
    }

    void embaralhar(){
        Collections.shuffle(deck);
    }

    Carta puxar(){
        return deck.removeFirst();
    }

    ArrayList<Carta> puxar(int n){
        ArrayList<Carta> L = new ArrayList<>();
        for(int i=0; i<n; i++){
            L.add(deck.removeFirst());
        }
        return L;
    }

    void descartar(Carta C){
        descarte.add(C);
    }

    static void main(){
        Baralho B = new Baralho();
        B.gerar_baralho();
        System.out.println(B.deck);
        System.out.println(B.descarte);
        B.embaralhar();
        System.out.println(B.deck);

        ArrayList<Carta> minhaMao = new ArrayList<>();
        minhaMao.add(new Carta("3","copas"));
        minhaMao.addAll(B.puxar(5));
        System.out.println(minhaMao);
    }
}