package sorts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-110);
        list.add(70);
        list.add(14);
        list.add(7);
        list.add(-14);
        list.add(3);
        list.add(-41);
        list.add(-10);
        list.add(-100);
        list.add(-15);
        list.add(15);

        SelectionSort.sort(list, (o1, o2) -> o1 - o2);
        print("Selection Sort (min -> max)", list);

        InsertionSort.sort(list, (o1, o2) -> o2 - o1);
        print("Insertion Sort (max -> min)", list);

        BubbleSort.sort(list, (o1, o2) -> o1 - o2);
        print("Buble Sort (min -> max)", list);


        MergeSort.sort(list, (o1, o2) -> o2 - o1);
        print("Merge Sort (max -> min)", list);
    }

    private static void print(String label, List<Integer> list) {
        System.out.println(label);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println("\n--------------------------------");
    }
}
