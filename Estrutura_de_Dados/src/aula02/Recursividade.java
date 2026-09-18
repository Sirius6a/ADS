package aula02;

public class Recursividade {
    void main() {
        contar(10);
    }

    void contar(int n) {
        if (n == 0) {
            IO.println("FIM");
            return;
        }

        IO.println(n);
        contar(n - 1);
    }
}
