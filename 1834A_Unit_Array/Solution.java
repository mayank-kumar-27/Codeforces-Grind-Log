import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int e = 0;
            for (int i = 0; i < n; i++) if (sc.nextInt() == -1) e++;
            int o = 0;
            while (e > n / 2) { e--; o++; }
            if (e % 2 == 1) { e--; o++; }
            System.out.println(o);
        }
        sc.close();
    }
}