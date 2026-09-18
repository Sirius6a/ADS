package aula04_desafios;

public class D4 {

    int[] x = {2, 8, 3, 9, 12};

    void main() {
        int procurarPor = 9;
        boolean encontrou = false;
        IO.println("Procurando...");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Analisando o índice %d: %d\n", i, x[i]);
            if (x[i] == procurarPor) {
                // Encontrou na posição 3
                System.out.printf("Encontrou na posição %d\n", i);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            IO.println("Não encontrou");
        }
    }
}
