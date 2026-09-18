package Baralho_do_Weslei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    Baralho deck;
    ArrayList<Carta> mao;

    BlackJack(){
        deck = new Baralho();
        deck.gerar_baralho();
        deck.embaralhar();
        mao = new ArrayList<>();
        puxar();
        puxar();
        exibir_estado();
        executar();
    }

    void puxar(){
        mao.add(deck.puxar());
    }

    int calcular_pontos(){
        int pontos = 0;
        int num_A = 0;

        for (Carta c: mao){
            if ((c.valor).equals("A")){
                num_A++;
                pontos++;
            } else if (List.of("J", "Q", "K").contains(c.valor)) {
                pontos += 10;
            } else {
                pontos += Integer.parseInt(c.valor);
            }
        }
        for(int i=0; i<num_A; i++){
            if (pontos + 10 <= 21){
                pontos += 10;
            }
        }

        return pontos;
    }

    void exibir_estado(){
        int pontos = calcular_pontos();
        System.out.println("Pontos: "+pontos);
        System.out.println("Mão: ");
        System.out.println(mao);
        if (pontos == 21) { // minha solução foi checar a vitória dentro do exibir_estado
            System.out.println("Vitória!!!");
            System.exit(0); // esse código funciona como um breaker
        }
    }


    void executar(){
        Scanner sc = new Scanner(System.in);
        int pontos = 0;
        while (true){
            System.out.println("Quer continuar?(s/n): ");
            String op = sc.nextLine();
            if(op.equals("n")){
                System.out.println("Fim do Jogo");
                break;
            }
            puxar();
            exibir_estado();
            pontos = calcular_pontos();
            if (pontos > 21){
                System.out.println("Você tem mais que 21. Você Perdeu");
                break;
            }
//            if (pontos == 21){
//                System.out.println("Vitória!!!");
//                break;
//            }
        }

        System.out.println("Pontuação final: "+pontos);
    }

    static void main(){
        BlackJack jogo = new BlackJack();
    }

}