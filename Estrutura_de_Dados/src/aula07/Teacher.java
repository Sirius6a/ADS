package aula07;

import java.util.Objects;

public record Teacher(String name, String classes, String catchphrase) {

    @Override
    public String toString() {
        return "Nome: " + name + "| Matéria: " + classes + "| Frase de Efeito: " + catchphrase;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Teacher other) {
            return Objects.equals(this.name, other.name());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
