package Baralho_do_Weslei;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    void main(){
        ArrayList<Carta> L = new ArrayList<Carta>();

        L.add(new Carta("5", "paus"));

        Carta C = new Carta("Q", "ouros");

        L.add(C);
        L.add(new Carta("J", "copas"));
        L.add(new Carta("7", "espadas"));

        System.out.println(L);

        Collections.shuffle(L);

        System.out.println(L);

//        for (Baralho_do_Weslei.Carta X : L){
//            X.mostrar();
//        }

    }
}