package collects;
/*
    Cho xâu S có N chữ số (0 < N < 256).
    Viết chương trình xóa đi K chữ số (0 < K < N) để xâu còn lại biểu diễn một số nhỏ nhất
    Ví dụ:  S = "2405179"
            K = 3
    Xóa 3 chữ số gồm '2', '4', '7' ta được xâu nhỏ nhất là 0517
*/

import java.util.Stack;

public class XauCoSoNhoNhat {
    public static void main(String[] args) {
        String s = "121198";
        int k = 1;
        System.out.println(new XauCoSoNhoNhat().soNhoNhat(s, k));
    }

    public String soNhoNhat(String s, int k) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        for (Character c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(c);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && (i < k)) {
                stack.pop();
                i++;
                if (i >= k)
                    break;
            }
            if (i <= k)
                stack.add(c);
        }
        StringBuilder builder = new StringBuilder();
        stack.forEach(c -> builder.append(c));
        return builder.toString();
    }
}
