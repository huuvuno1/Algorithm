package data_structures;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(192); 
        linkedList.add(19); 
        // linkedList.add(1); 
        // linkedList.add(319); 
        linkedList.add(19); 
        linkedList.add(19); 
        linkedList.add(192); 
        linkedList.add(19); 

        linkedList.forEach(e -> System.out.print(e + "  "));
        System.out.println();
        linkedList.removeAll(19);
        linkedList.forEach(e -> System.out.print(e + "  "));

        System.out.println(linkedList.contains(192));

    }
}
