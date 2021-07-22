package sort;

import java.io.Serializable;
import java.util.List;

public class SelectionSort {
    public static <T extends Serializable> void sort(List<T> list, Comparator<T> comparator) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (comparator.compare(list.get(j), list.get(min)) < 0)
                    min = j;
            }
            T temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }
}
