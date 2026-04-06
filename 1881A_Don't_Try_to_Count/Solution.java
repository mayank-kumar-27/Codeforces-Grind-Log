import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            String x = sc.next(), s = sc.next();
            String cur = x;
            int ops = 0;
            while (cur.length() < m) {
                cur += cur;
                ops++;
            }
            boolean found = false;
            for (int i = 0; i < 3; i++) {
                if (cur.contains(s)) {
                    System.out.println(ops);
                    found = true;
                    break;
                }
                cur += cur;
                ops++;
            }
            if (!found) System.out.println(-1);
        }
        sc.close();
    }
}