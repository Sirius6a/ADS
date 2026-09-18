package aula04_desafios;

public class D6 {
    int[] X = {2, 8, 3, 9, 12, 8, 7};
    void main() {
        int procurarPor = 25;
        int n = buscar(procurarPor);
        if (n == 0) {
            System.out.printf("O valor %d não foi encontrado!\n", procurarPor);
        } else {
            if (n == 1) {
                System.out.printf("O valor %d foi encontrado %d vez\n", procurarPor, n);
            } else {
                System.out.printf("O valor %d foi encontrado %d vezes\n", procurarPor, n);
            }
        }
    }

    int buscar(int n) {
        int cont = 0;
        for (int a : X) {
            if (a == n) {
                cont++;
            }
        }
        return cont;
    }
}
