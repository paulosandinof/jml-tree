package br.edu.imd.wlademir;

public class Tree {
    private /*@ spec_public @*/ Node raiz = null;

    public /*@ pure @*/ boolean isEmpty() {
        return raiz == null;
    }

    public /*@ pure @*/ Node getRoot() {
        return raiz;
    }

    /*@ requires node != null;
    @*/
    public void insert(Node node) {
        if (isEmpty()) {
            raiz = node;
            return;
        }
        raiz.insert(node);
        calcularBalanceamento();
    }

    /*@ assignable raiz;
    @*/
    public void insert(int value) {
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int key) {
        if (isEmpty()) {
            return null;
        }
        return raiz.search(key);
    }

    public /*@ pure @*/ void preOrdem() {
        if (!isEmpty()) {
            raiz.preOrdem();
        }
    }

    public /*@ pure @*/ void inOrdem() {
        if (!isEmpty()) {
            raiz.inOrdem();
        }
    }

    public /*@ pure @*/ void posOrdem() {
        if (!isEmpty()) {
            raiz.posOrdem();
        }
    }

    public /*@ pure @*/ void calcularBalanceamento() {
        if (!isEmpty()) {
            raiz.calcularBalanceamento();
        }
    }

    public void remove(int value) {
        if (isEmpty()) {
            return;
        }
        raiz.remove(value);
    }

    public /*@ pure @*/ void printTree() {

        if (!isEmpty()) {

            System.out.println("\n" + raiz.printTree(0));
        }
    }
}
