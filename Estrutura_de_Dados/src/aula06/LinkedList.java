package aula06;

public class LinkedList {
    private Node head;
    private int total_elementos = 0;

    public static class Node {
        private Aluno aluno;
        Node next;

        public Node(Aluno aluno) {
            this.aluno = aluno;
            this.next = null;
        }

        public Aluno getAluno() {
            return aluno;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return total_elementos;
    }

    public void insertFirst(Aluno aluno) {
        var newNode = new Node(aluno);
        newNode.next = this.head;
        this.head = newNode;
        total_elementos++;
    }

    public void insertEnd(Aluno aluno) {
        var newNode = new Node(aluno);
        if (isEmpty()) {
            head = newNode;
            total_elementos++;
            return;
        }
        var temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        total_elementos++;
    }

    public Aluno removeFirst() {
        if (isEmpty()) return null;
        Aluno removido = head.aluno;
        head = head.next;
        total_elementos--;
        return removido;
    }

    public Aluno removeEnd() {
        if (isEmpty()) return null;

        // Caso 1: A lista só tem um elemento
        if (head.next == null) {
            Aluno removido = head.aluno;
            head = null;
            total_elementos--;
            return removido;
        }

        // Caso 2: A lista tem dois ou mais elementos
        var temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // temp agora é o PENÚLTIMO elemento
        Aluno removido = temp.next.aluno; // Salva o aluno do ÚLTIMO elemento
        temp.next = null;                 // Desconecta o último elemento

        total_elementos--;
        return removido;                  // Retorna o aluno correto
    }


    // Remove um aluno específico de qualquer lugar da fila pela matrícula
    public boolean remove(String matricula) {
        if (isEmpty()) return false;

        if (head.aluno.getMatricula().equals(matricula)) {
            head = head.next;
            total_elementos--;
            return true;
        }

        var temp = head;
        while (temp.next != null) {
            if (temp.next.aluno.getMatricula().equals(matricula)) {
                temp.next = temp.next.next; // "Pula" o nó removido
                total_elementos--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean contains(String matricula) {
        if (isEmpty()) return false;
        var temp = head;
        while (temp != null) {
            if (temp.aluno.getMatricula().equals(matricula)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Aluno search(String matricula) {
        if (isEmpty()) return null;

        var temp = head;
        while (temp != null) {
            if (temp.aluno.getMatricula().equals(matricula)) {
                return temp.aluno;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertAt(int index, Aluno aluno) {
        if (index < 0 || index > total_elementos) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            insertFirst(aluno);
            return;
        }

        var newNode = new Node(aluno);
        var temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        total_elementos++;
    }

    public void print() {
        var temp = head;
        while (temp != null) {
            System.out.println(temp.aluno);
            temp = temp.next;
        }
    }

    void print(Node n){ // recebe um no, imprime ele e outros nos aos quais o primeiro aponta
        var temp = n;
        while (temp != null) {
            System.out.println(temp.aluno);
            temp = temp.next;
        }
    }
}