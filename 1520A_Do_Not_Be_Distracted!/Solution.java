import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean[] u = new boolean[26];
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (i > 0 && c != s.charAt(i - 1)) { if (u[c - 'A']) { ok = false; break; } u[s.charAt(i - 1) - 'A'] = true; }
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}