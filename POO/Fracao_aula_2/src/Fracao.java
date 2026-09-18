public class Fracao {

    int numerador;
    int denominador;
    void mostrar(){
        System.out.println("Fração "+numerador+"/"+denominador);
    }
    void mostrar_produto(Fracao A){
        int n = numerador * A.numerador;
        int d = denominador * A.denominador;

        System.out.println("Resultado "+n+"/"+d);
    }
}
