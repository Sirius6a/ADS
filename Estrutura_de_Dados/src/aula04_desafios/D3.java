package aula04_desafios;

public class D3 {

    int[] x = {2, 8, 3, 9, 12};

    void main() {
        int procurarPor = 9;
        boolean encontrou = false;
        IO.println("Procurando...");
        // Analisando o índice 0: 2
        // Analisando o índice 1: 8
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Analisando o índice %d: %d\n", i, x[i]);
            if (x[i] == procurarPor) {
                IO.println("Encontrou");
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            IO.println("Não encontrou");
        }

    }
}
