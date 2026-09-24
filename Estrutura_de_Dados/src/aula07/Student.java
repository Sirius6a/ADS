package aula07;

import java.util.Objects;

//Um record em Java é um tipo especial de classe feito para:
//carregar dados de forma simples e sem código repetitivo.
//Como funciona:
//Em vez de escrever uma classe comum com vários campos, construtores, getters, equals, hashCode e toString,
//você usa a palavra-chave record e o Java cria tudo isso sozinho nos bastidores.

public record Student(String name, String registration, int priority) {

    @Override
    public String toString() {
        return "Nome: " + name + "| Matrícula: " + registration + "| Prioridade: " + priority;
    }

    // Mantendo o equals focado apenas na matrícula para as buscas funcionarem, fiz com ajuda da IA, ainda estou entendendo como funciona
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Student other) {
            return Objects.equals(this.registration, other.registration);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registration);
    }
}
