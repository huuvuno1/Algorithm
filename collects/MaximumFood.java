package collects;

import java.util.Arrays;

public class MaximumFood {
    public static void main(String[] args) {
        int [] prices = new int [] {1, 2, 10, 3, 200, 4};
        int k = 9;
        System.out.println(new MaximumFood().maximumFoods(prices, k));
    }

    public int maximumFoods(int [] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
            if (sum > k)
                return i;
        }
        return 0;
    }
}