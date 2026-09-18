public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Fracao F = new Fracao();

        F.numerador = 5;
        F.denominador = 10;

        F.mostrar();

        Fracao x = new Fracao();
        x.numerador = 4;
        x.denominador = 10;
        x.mostrar();

        F.mostrar_produto(x);


    }
}