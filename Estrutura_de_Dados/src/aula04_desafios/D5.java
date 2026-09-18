package aula04_desafios;

public class D5 {
    int[] X = {2, 8, 3, 9, 12};
    void main() {
        if (buscar(90)) {
            IO.println("Encontrou");
        } else {
            IO.println("Não encontrou");
        }
    }
    boolean buscar(int n) {
        for (int a : X) {
            if (a == n) {
                return true;
            }
        }
        return false;
    }
}
