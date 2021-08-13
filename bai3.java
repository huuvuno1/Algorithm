import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai3 {
    public static void main(String[] args) {
        int [] a = {3, 1, 5, 2, 1};
        int [] b = {6, 2, 3, 0, 11, 3, 3};
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
        for (int i = 0; i < B.size(); i++) 
            System.out.print(B.get(i) + "  ");
        return new int[2];
    }
    static void print (int []a) {
        // for (int i : a)
    }

    static void convert(int []a, List<Integer> A) {
        for (int i : a) 
            A.add(i);
    }
}
