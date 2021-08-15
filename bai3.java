import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai3 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        int [] b = {1, 1, 2, 3, 4, 5, 5, 2};
        print(soConThieu(a, b));
    }
    static int [] soConThieu(int [] a, int [] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        convert(a, A);
        convert(b, B);
        for (int i = 0; i < B.size(); i++) {
            Integer temp = B.get(i);
            if (A.contains(temp)) {
                A.remove(temp);
                B.remove(temp);
            }
        }
        return B.stream().mapToInt(i -> i).toArray();
    }
    static void print (int []a) {
        for (int i : a)
            System.out.print(i + "  ");
    }

    static void convert(int []a, List<Integer> A) {
        for (int i : a) 
            A.add(i);
    }
}
