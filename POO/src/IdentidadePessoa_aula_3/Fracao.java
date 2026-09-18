package IdentidadePessoa_aula_3;

public class Fracao {
    int numerador;
    int denominador;

    Fracao(int numerador, int denominador){
        this.numerador = numerador;
        if(denominador == 0){
            System.out.println("Não pode ter denominador zero");
            denominador = 1;
        }
        this.denominador = denominador;
    }

    void mostrar(){
        System.out.println(numerador+"/"+denominador);
    }

    Fracao inversa(){
        int num = this.denominador;
        int den = this.numerador;
        Fracao N = new Fracao(num,den);
        return N;
    }

    Fracao soma(Fracao F){
        int num = (this.numerador * F.denominador) + (F.numerador * this.denominador);
        int den = this.denominador * F.denominador;
        Fracao N = new Fracao(num, den);
        //N.simplificar();
        return N;
    }

    Fracao subtracao(Fracao F){
        int num = (this.numerador * F.denominador) - (F.numerador * this.denominador);
        int den = this.denominador * F.denominador;
        Fracao N = new Fracao(num, den);
        //N.simplificar();
        return N;
    }

    Fracao produto(Fracao F){
        int num = this.numerador * F.numerador;
        int den = this.denominador * F.denominador;
        Fracao N = new Fracao(num, den);
        //N.simplificar();
        return N;
    }

    Fracao divisao(Fracao F){
        Fracao f_inversa = F.inversa();
        int num = this.numerador * f_inversa.numerador;
        int den = this.denominador * f_inversa.denominador;
        Fracao N = new Fracao(num,den);
        return N;
    }
}
