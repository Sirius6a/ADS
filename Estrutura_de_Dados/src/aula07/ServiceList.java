package aula07;

public class ServiceList<T> {
    // Agora a lista aceita o tipo genérico T
    private LinkedList<T> lista = new LinkedList<>();

    public void adicionarNoFim(T elemento) {
        lista.insertEnd(elemento);
    }

    public void adicionarNoInicio(T elemento) {
        lista.insertFirst(elemento);
    }

    public void adicionarPorIndice(int indice, T elemento) {
        try {
            lista.insertAt(indice, elemento);
            System.out.println("Elemento inserido na posição " + indice + ".");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Posição " + indice + " é inválida. (Tamanho atual: " + lista.size() + ").");
        }
    }

    public T removerPrimeiro() {
        if (lista.isEmpty()) {
            System.out.println("A estrutura está vazia!");
            return null;
        }
        return lista.removeFirst();
    }

    // Remove qualquer elemento baseado no .equals() do objeto passado
    public void removerElemento(T elementoMolde) {
        boolean removido = lista.remove(elementoMolde);
        if (removido) {
            System.out.println("Elemento removido com sucesso.");
        } else {
            System.out.println("Erro: Elemento não foi encontrado.");
        }
    }

    // Busca qualquer elemento baseado no .equals() e o retorna
    public T buscarElemento(T elementoMolde) {
        T encontrado = lista.search(elementoMolde);
        if (encontrado != null) {
            System.out.println("Elemento encontrado: ");
            System.out.println(encontrado);
        } else {
            System.out.println("Elemento não foi encontrado.");
        }
        return encontrado;
    }

    public void exibirTodos() {
        if (lista.isEmpty()) {
            System.out.println("Está vazia no momento.");
            return;
        }
        System.out.println("Fila atual: ");
        lista.print();
    }

    public int quantidadeTotal() {
        return lista.size();
    }
}
