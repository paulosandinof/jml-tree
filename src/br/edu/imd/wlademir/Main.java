package br.edu.imd.wlademir;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(15);
        tree.insert(12);
        tree.insert(18);
        tree.insert(30);
        tree.insert(25);
        tree.insert(22);
        tree.insert(28);
        tree.insert(35);
        tree.insert(32);
        tree.insert(38);
        

        tree.printTree();

        // [PONTO DE FALHA 1] 
//        Node n = null;
//        tree.insert(n);

//        tree.inOrdem();
//
//
//        tree.remove(38);
//
        System.out.println(tree.search(22).toString());
//
//        tree.inOrdem();
//        tree.remove(35);
//        System.out.println();
//        tree.preOrdem();
//
//        tree.remove(20);
//        System.out.println();
//        tree.preOrdem();

//
        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        TreeView view = new TreeView(tree);

        frame.add(view);

        frame.setVisible(true);

    }
}
