package sorts;

import java.io.Serializable;
import java.util.List;

public class InsertionSort {
    public static <T extends Serializable> void sort(List<T> list, Comparator<T> comparator) {
        for (int i = 1; i < list.size(); i++) {
            int j = i - 1;
            T temp = list.get(i);
            while (j >= 0 && comparator.compare(list.get(j), temp) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, temp);
        }
    }
}
