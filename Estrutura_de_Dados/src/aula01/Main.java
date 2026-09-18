package aula01;

public class Main {
    void main() {
        checkout(2000.0);
    }

    void checkout(double valorCompra) {
        IO.println("-".repeat(43));
        var valorFinal = aplicarDesconto(valorCompra);
        IO.println("Valor a pagar: R$ " + valorFinal);
        IO.println("-".repeat(45));
        IO.println();
    }

    double aplicarDesconto(double valorCompra) {
        IO.println("Calculando desconto de fidelidade...");
        return valorCompra * 0.9;
    }
}
