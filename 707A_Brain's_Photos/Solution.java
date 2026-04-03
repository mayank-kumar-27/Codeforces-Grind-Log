import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), c = 0;
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) {
            String s = sc.next();
            if (s.equals("C") || s.equals("M") || s.equals("Y")) c++;
        }
        System.out.println(c > 0 ? "#Color" : "#Black&White");
        sc.close();
    }
}