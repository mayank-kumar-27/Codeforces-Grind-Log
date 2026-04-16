import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int b = 2, m = 0;
            for (int x = 2; x <= n; x++) {
                int s = 0;
                for (int p = x; p <= n; p += x) s += p;
                if (s > m) { m = s; b = x; }
            }
            System.out.println(b);
        }
        sc.close();
    }
}