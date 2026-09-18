package aula03_desafios;

public class D1 {
    int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    void main() {
        IO.print("[");
        for (int i = 0; i < x.length; i++) {
            IO.print(x[i]);
            if (i != x.length - 1) {
                IO.print(", ");
            }
        }
        IO.print("]");
    }
}
