import java.util.Objects;

public class Carta {
    String valor;
    String naipe;

    Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = converter_naipe(naipe);
    }

    String converter_naipe(String in) {
        if (Objects.equals(in, "copas")) return "♥\uFE0F";
        if (Objects.equals(in, "ouros")) return "♦\uFE0F";
        if (Objects.equals(in, "paus")) return "♣\uFE0F";
        return "♠\uFE0F"; //espadas
    }

    void mostrar() {
        System.out.println(valor + " de " + naipe);
    }

    public String toString(){
        return valor + naipe;
    }
}