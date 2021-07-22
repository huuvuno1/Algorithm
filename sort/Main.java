package sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(0);
        list.add(14);
        list.add(-41);
        list.add(14);
        list.add(-7);

        SelectionSort.sort(list, (o1, o2) -> o1 - o2);
        print("Selection Sort (min -> max)", list);

        InsertionSort.sort(list, (o1, o2) -> o2 - o1);
        print("Insertion Sort (max -> min)", list);

        BubleSort.sort(list, (o1, o2) -> o1 - o2);
        print("Buble Sort (min -> max)", list);
    }

    private static void print(String label, List<Integer> list) {
        System.out.println(label);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println("\n--------------------------------");
    }
}
