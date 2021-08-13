public class bai2 {
    public static void main(String[] args) {
        int [][] arr = {
            {9,-9,-9,1,1,1},
            {0,-9,0,4,3,2},
            {-9,-9,-9,1,2,3},
            {0,0,8,6,6,0},
            {0,0,0,-2,0,0},
            {0,0,1,2,4,0}
        };
        System.out.println(maxSum(arr));
    }
    static int maxSum(int [][] arr) {
        int max = getSum(arr, 1, 1);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int sum = getSum(arr, i, j);
                if (sum > max)
                    max = sum;
            }   
        }
        return max;
    }

    static int getSum(int [][] arr, int i, int j) {
        return arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
                        arr[i][j] +
                arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
    }
}
