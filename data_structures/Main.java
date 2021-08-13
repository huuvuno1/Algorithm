package data_structures;

import data_structures.BinaryTree.Type;

public class Main{
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(1);
        binaryTree.add(10);
        binaryTree.add(41);
        binaryTree.add(15);
        binaryTree.add(-10);
        binaryTree.add(11);
        binaryTree.add(105);
        binaryTree.add(411);
        binaryTree.add(151);
        binaryTree.add(-1555);
        
        binaryTree.print(Type.LNR);
        // LinkedList<Integer> linkedList = new LinkedList<>();
        // linkedList.add(192); 
        // linkedList.add(19); 
        // // linkedList.add(1); 
        // // linkedList.add(319); 
        // linkedList.add(19); 
        // linkedList.add(19); 
        // linkedList.add(192); 
        // linkedList.add(19); 

        // linkedList.forEach(e -> System.out.print(e + "  "));
        // System.out.println();
        // linkedList.removeAll(19);
        // linkedList.forEach(e -> System.out.print(e + "  "));

        // System.out.println(linkedList.contains(192));



    }

}
