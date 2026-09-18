public class Main {
    public static void main(String[] args) {
//        Pessoa P; // declarando variavel tipo pessoa
//        P = new Pessoa("Juremildo Solineudo", 17, "020.032.333-53", 1.57f, 70); //Instanciar pessoa
//        P.Mostrar_dados();
//
//        System.out.println();
//
//        Pessoa p2 = new Pessoa("Maria", 19, "042.456.786-12", 172f, 64);
//        p2.Mostrar_dados();
//
//        System.out.println();
//        P.apresentar();
//        P.perguntar_nome(p2);
//
//        System.out.println();
//
//        Pessoa P3 = P.fazer_minino(p2);
//        P3.Mostrar_dados();
        Fracao A = new Fracao(3,5);
        A.mostrar();

        Fracao B = new Fracao(4,6);
        B.mostrar();

        System.out.println();

        // SOMA

        Fracao C = A.soma(B);
        System.out.println("SOMA");
        System.out.println("----------------------------------------");
        C.mostrar();
        System.out.println("----------------------------------------");

        // Subtração

        Fracao D = A.subtracao(B);
        System.out.println("SUBTRACAO");
        System.out.println("----------------------------------------");
        D.mostrar();
        System.out.println("----------------------------------------");

        // Multiplicação

        Fracao E = A.produto(B);
        System.out.println("PRODUTO");
        System.out.println("----------------------------------------");
        E.mostrar();
        System.out.println("----------------------------------------");

        // Divisão

        Fracao F = A.divisao(B);
        System.out.println("DIVISAO");
        System.out.println("----------------------------------------");
        F.mostrar();
        System.out.println("----------------------------------------");

        // INVERSA

        System.out.println("INVERSA");
        System.out.println("----------------------------------------");
        Fracao b_inversa = B.inversa();
        b_inversa.mostrar();
        System.out.println("----------------------------------------");

    }
}
