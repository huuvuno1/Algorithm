package sorts;

import java.io.Serializable;
import java.util.List;

public class BubbleSort {
    public static <T extends Serializable> void sort(List<T> list, Comparator<T> comparator) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (comparator.compare(list.get(j - 1), list.get(j)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
    }
}