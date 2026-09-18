package aula05_desafios;

public class D7 {
    int[] X = {2, 3, 8, 9, 12, 13, 14, 16, 17};

    void main() {
        if (buscarBinario(17)) {
            IO.println("Encontrou");
        } else {
            IO.println("Não encontrou");
        }
    }

    boolean buscarLinear(int n) {
        for (int a : X) {
            if (a == n) {
                return true;
            }
        }
        return false;
    }

    boolean buscarBinario(int n) {
        int inicio = 0;
        int fim = X.length - 1;
        do {
            int meio = (inicio + fim) / 2;
            if (X[meio] == n) {
                return true;
            } else {
                if (n > X[meio]) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        } while (inicio <= fim);
        return false;
    }
}
