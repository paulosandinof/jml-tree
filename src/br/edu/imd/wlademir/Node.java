package br.edu.imd.wlademir;

public class Node {

    private /*@ spec_public nullable @*/ Integer valor;
    private /*@ spec_public nullable @*/ Node left;
    private /*@ spec_public nullable @*/ Node right;
    private /*@ spec_public nullable @*/ Integer balanceamento;

    /*@
    @ assignable valor, left, right, balanceamento;
    @*/
    public Node() {
        this.valor = null;
        this.left = null;
        this.right = null;
        this.balanceamento = null;
    }

    /*@ requires value != null;
    @ assignable valor, left, right, balanceamento;
    @*/
    public Node(Integer value) {
        this.valor = value;
        this.left = null;
        this.right = null;
        this.balanceamento = null;
    }

    public /*@ pure @*/ Integer getBalanceamento() {
        return balanceamento;
    }

    /*@ requires balanceamento != null;
    @ assignable this.balanceamento;
    @*/
    public void setBalanceamento(Integer balanceamento) {
        this.balanceamento = balanceamento;
    }

    public /*@ pure @*/ Integer getValor() {
        return valor;
    }

    public /*@ pure @*/ Node getLeft() {
        return left;
    }

    public /*@ pure @*/ Node getRight() {
        return right;
    }

    public /*@ pure @*/ boolean isEmpty() {
        return (this.valor == null);
    }

    /*@ 
    @ requires node != null && (node.getValor != null); 
    @ assignable left, right, valor;
    @
    @*/
    public void insert(Node node) {
        if (node.getValor() < this.valor) { // inserir a esqueda
            if (this.left == null) { // esqueda é uma folha?
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.getValor() > this.valor) { // inserir a direita
            if (this.right == null) { // direita é uma folha?
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }
    
	
    public Node search(int key) {
        if (key == this.valor) {
            return this;
        }

        if (key < this.valor) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.valor) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    public /*@ pure @*/ void preOrdem() {
        System.out.print(this.valor + " ");
        if (this.left != null) {
            this.left.preOrdem();
        }
        if (this.right != null) {
            this.right.preOrdem();
        }
    }

    public /*@ pure @*/void inOrdem() {

        if (this.left != null) {
            this.left.inOrdem();
        }
        System.out.print(this.valor + " ");

        if (this.right != null) {
            this.right.inOrdem();
        }
    }

    public void posOrdem() {

        if (this.right != null) {
            this.right.posOrdem();
        }
        if (this.left != null) {
            this.left.posOrdem();
        }
        System.out.print(this.valor + " ");
    }

    public Node remove(int value) {

        if (this.valor == value) {

            if (this.right == null && this.left == null) {
                return null;
            } else {

                if (this.right == null && this.left != null) {
                    return this.left;
                } else if (this.right != null && this.left == null) {
                    return this.right;
                } else {
                    Node aux = this.left;
                    while (aux.right != null) {
                        aux = aux.right;
                    }

                    this.valor = aux.getValor();
                    aux.valor = value;
                    this.left = left.remove(value);
                }
            }
        } else if (this.valor > value) {

            this.left = this.left.remove(value);
        } else if (this.valor < value) {

            this.right = this.right.remove(value);
        }

        return this;
    }

    public String toString() {
        if (this.getBalanceamento() == null) {
            return "[" + this.getValor() + "]";
        } else {
            return "[" + this.getValor() + "]" + "( balanceamento :" + this.getBalanceamento() + ")";
        }
    }

    public String printTree(int level) {

        String str = toString() + "\n";
        for (int i = 0; i <= level; i++) {
            str += "\t";
        }
        if (this.getLeft() != null) {

            str += "o-ESQ: " + this.left.printTree(level + 1);
        } else {

            str += "o-ESQ: NULL";
        }
        str += "\n";
        for (int i = 0; i <= level; i++) {
            str += "\t";
        }
        if (this.getRight() != null) {

            str += "o-DIR: " + this.right.printTree(level + 1);
        } else {

            str += "o-DIR: NULL";
        }
        str += "\n";

        return str;
    }
    
    /*@ 
    @ ensure \result >= 1;
    @*/
    public int calcAltura() {

        if (this.left == null && this.right == null) {
            return 1;
        } else if (this.left != null && this.right == null) {
            return 1 + this.left.calcAltura();
        } else if (this.left == null && this.right != null) {
            return 1 + this.right.calcAltura();
        } else {

            return 1 + Math.max(this.left.calcAltura(), this.right.calcAltura());
        }
    }
    
    /*@ 
    @ assignable this.balanceamento;
    @*/
    public void calcularBalanceamento() {
        if (this.left == null && this.right == null) {
            this.balanceamento = 0;
        } else if (this.left == null && this.right != null) {
            this.balanceamento = this.right.calcAltura() - 0;
        } else if (this.left != null && this.right == null) {
            this.balanceamento = 0 - this.left.calcAltura();
        } else {

            this.balanceamento = this.right.calcAltura() - this.left.calcAltura();
        }

        if (this.right != null) {
            this.right.calcularBalanceamento();
        }
        if (this.left != null) {
            this.left.calcularBalanceamento();
        }
    }
}
