package Baralho_do_Weslei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    Baralho deck;
    ArrayList<Carta> casa;
    ArrayList<Carta> mao;

    public BlackJack() {
        deck = new Baralho("sim");
        casa = new ArrayList<>();
        mao = new ArrayList<>();

        puxar_mao();
        puxar_mao();
        puxar_casa();
        puxar_casa();

        exibir_estado();
        executar();
    }

    void puxar_mao() {
        mao.add(deck.puxar());
    }

    void puxar_casa() {
        casa.add(deck.puxar());
    }

    int calcular_pontos(ArrayList<Carta> cartas) {
        int pontos = 0;
        int num_A = 0;

        for (Carta c : cartas) {
            if ((c.valor).equals("A")) {
                num_A++;
                pontos += 1;
            } else if (List.of("J", "Q", "K").contains(c.valor)) {
                pontos += 10;
            } else {
                pontos += Integer.parseInt(c.valor);
            }
        }

        for (int i = 0; i < num_A; i++) {
            if (pontos + 10 <= 21) {
                pontos += 10;
            }
        }
        return pontos;
    }

    void exibir_estado() {
        int pontos_mao = calcular_pontos(mao);
        int pontos_casa = calcular_pontos(casa);
        System.out.println("\n--- ESTADO DO JOGO ---");
        System.out.println("Casa: " + casa + " | Pontos: " + pontos_casa);
        System.out.println("Mão: " + mao + " | Pontos: " + pontos_mao);
        System.out.println("----------------------\n");
    }

    void executar() {
        Scanner sc = new Scanner(System.in);
        int pontos_mao = calcular_pontos(mao);
        int pontos_casa = calcular_pontos(casa);

        while (true) {
            if (pontos_mao == 21) {
                System.out.println("Você alcançou 21 pontos! Turno da casa...");

                while (pontos_casa < pontos_mao && pontos_casa <= 21) {
                    puxar_casa();
                    pontos_casa = calcular_pontos(casa);
                    exibir_estado();
                }

                exibir_resultados_finais(pontos_casa, pontos_mao);
                break;
            }

            System.out.print("Quer puxar mais uma?(s/n): ");
            String op = sc.nextLine();

            if (op.equals("n")) {
                while (pontos_casa < pontos_mao && pontos_casa <= 21) {
                    puxar_casa();
                    pontos_casa = calcular_pontos(casa);
                    exibir_estado();
                }

                exibir_resultados_finais(pontos_casa, pontos_mao);
                break;
            }

            puxar_mao();
            pontos_mao = calcular_pontos(mao);
            exibir_estado();

            if (pontos_mao > 21) {
                System.out.println("Você tem mais que 21. Você Perdeu!");
                break;
            }
        }
        Reiniciar();
    }

    // Metodo auxiliar para evitar repetição de código na hora de mostrar o resultado
    void exibir_resultados_finais(int pontos_casa, int pontos_mao) {
        System.out.println("Pontuação final da casa: " + pontos_casa);
        System.out.println("Pontuação final na mão: " + pontos_mao);

        if (pontos_casa > 21) {
            System.out.println("A casa estourou! Você venceu!!!");
        } else if (pontos_casa > pontos_mao) {
            System.out.println("A casa venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

    void Reiniciar() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nQuer jogar novamente?(s/n): ");
        String rr = s.nextLine();
        if (rr.equals("s")) {
            new BlackJack();
        } else {
            System.out.println("Obrigado por jogar!");
        }
    }

    public static void main(String[] args) {
        new BlackJack();
    }
}
