package aula11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class Desafio9 {

    // Classe para representar um ponto/nó no labirinto
    private static class Ponto {
        int x, y;
        Ponto pai; // Para reconstruir o caminho no final

        Ponto(int x, int y, Ponto pai) {
            this.x = x;
            this.y = y;
            this.pai = pai;
        }
    }

    public static void resolverLabirinto(char[][] matriz) {
        // Validação de entrada extrema (matriz vazia ou inválida)
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("Matriz inválida.");
            return;
        }

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        Ponto inicio = null;
        Ponto destino = null;

        // Encontra os pontos S (Início) e E (Destino)
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == 'S') inicio = new Ponto(i, j, null);
                if (matriz[i][j] == 'E') destino = new Ponto(i, j, null);
            }
        }

        if (inicio == null || destino == null) {
            System.out.println("Posição de início (S) ou destino (E) não encontrada.");
            return;
        }

        // Fila para a busca em largura (BFS) e matriz de visitados
        Queue<Ponto> fila = new ArrayDeque<>();
        boolean[][] visitado = new boolean[linhas][colunas];

        // Inicializa a busca a partir do ponto de partida
        fila.add(inicio);
        visitado[inicio.x][inicio.y] = true;

        // Vetores de direção: Baixo, Cima, Direita, Esquerda
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Ponto pontoFinal = null;
        boolean encontrado = false;

        // Processamento da Fila
        while (!fila.isEmpty()) {
            Ponto atual = fila.poll();

            // Se chegamos no destino, encerra a busca
            if (atual.x == destino.x && atual.y == destino.y) {
                pontoFinal = atual;
                encontrado = true;
                break;
            }

            // Explora as 4 direções permitidas
            for (int i = 0; i < 4; i++) {
                int novoX = atual.x + dx[i];
                int novoY = atual.y + dy[i];

                // Validações: limites da matriz, se é parede (#) e se já foi visitado
                if (novoX >= 0 && novoX < linhas && novoY >= 0 && novoY < colunas) {
                    if (matriz[novoX][novoY] != '#' && !visitado[novoX][novoY]) {
                        visitado[novoX][novoY] = true;
                        fila.add(new Ponto(novoX, novoY, atual));
                    }
                }
            }
        }

        // Exibe os resultados
        if (encontrado) {
            System.out.println("Rota encontrada com sucesso!");
            marcarEExibirRota(matriz, pontoFinal);
        } else {
            System.out.println("Não existe caminho até o destino.");
        }
    }

    private static void marcarEExibirRota(char[][] matriz, Ponto fim) {
        // Percorre de volta do fim para o começo usando a referência do pai
        Ponto atual = fim.pai;
        while (atual != null && matriz[atual.x][atual.y] != 'S') {
            matriz[atual.x][atual.y] = 'x'; // Marca o caminho com 'x'
            atual = atual.pai;
        }

        // Imprime a matriz com a rota traçada
        for (char[] linha : matriz) {
            for (char c : linha) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // Método principal contendo os cenários de teste exigidos
    public static void main(String[] args) {
        System.out.println("=== TESTE 1: Cenário do Enunciado ===");
        char[][] mapa1 = {
                {'S', '.', '.', '#', '.'},
                {'#', '#', '.', '#', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '#', '#', '#', '.'},
                {'.', '.', '.', '.', 'E'}
        };
        resolverLabirinto(mapa1);

        System.out.println("\n=== TESTE 2: Sem Caminho Possível ===");
        char[][] mapa2 = {
                {'S', '.', '#', '.', '.'},
                {'#', '#', '#', '.', '.'},
                {'.', '.', '#', '.', '.'},
                {'.', '.', '#', '#', '#'},
                {'.', '.', '.', '.', 'E'}
        };
        resolverLabirinto(mapa2);

        System.out.println("\n=== TESTE 3: Caso Extremo (S ao lado de E) ===");
        char[][] mapa3 = {
                {'S', 'E'},
                {'.', '.'}
        };
        resolverLabirinto(mapa3);

        System.out.println("\n=== TESTE 4: Mapa Maior ===");
        char[][] mapa4 = {
                {'S', '.', '#', '#', '.', '.', '.'},
                {'#', '.', '#', '.', '.', '.', '#'},
                {'#', '.', '.', '.', '#', '.', '.'},
                {'.', '#', '#', '#', '#', '#', '.'},
                {'.', '#', '.', '.', 'E', '.', '.'}
        };
        resolverLabirinto(mapa4);
    }
}

