package sorts;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static <T> void sort(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty())
            return;
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(list, 0, list.size() - 1, comparator);
    }

    private <T> void mergeSort(List<T> list, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int middle = (left + right)/2;
            mergeSort(list, left, middle, comparator);
            mergeSort(list, middle + 1, right, comparator);
            merge(list, left, middle, right, comparator);
        }
    }

    private <T> void merge(List<T> list, int left, int middle, int right, Comparator<T> comparator) {
        List<T> tempList = new ArrayList<>();
        int i = left, j = middle + 1;

        while (i <= middle && j <= right) {
            if (comparator.compare(list.get(i), list.get(j)) > 0) {
                tempList.add(list.get(j));
                j++;
            }
            else {
                tempList.add(list.get(i));
                i++;
            }
        }

        while (i <= middle) {
            tempList.add(list.get(i));
                i++;
        }

        while (j <= right) {
            tempList.add(list.get(j));
                j++;
        }

        for (int k = left, q = 0; k <= right; k++, q++) {
            list.set(k, tempList.get(q));
        }
    }


}
