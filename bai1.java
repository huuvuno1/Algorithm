import java.util.Arrays;

// askd
public class bai1 {
    public static void main(String[] args) {
        int [] prices = new int[] {3, 2, 5, 4, 8}; // 2 3 4 5 8
        int k = 5;
        System.out.println(new bai1().maximumFoods(prices, k));
    }   

    public int maximumFoods(int [] prices, int k) {
        int count = 0;
        Arrays.sort(prices);
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
            count ++;
            if (sum > k) {
                count--;
                break;
            }
        }
        return count;
    }
    
}
