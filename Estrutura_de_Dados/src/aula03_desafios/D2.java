package aula03_desafios;

public class D2 {

    int[] x = {2, 8, 3, 9, 12};

    void main() {
        int procurarPor = 6;
        boolean encontrou = false;

        for (int i = 0; i < x.length; i++) {
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
