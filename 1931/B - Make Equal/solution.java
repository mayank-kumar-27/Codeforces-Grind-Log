import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
 
        while (t-- > 0) {
            int n = s.nextInt();
            long sum = 0;
 
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
                sum += a[i];
            }
 
            long x = sum / n, pre = 0;
            boolean ok = true;
 
            for (int i = 0; i < n; i++) {
                pre += a[i] - x;
 
                if (pre < 0)
                    ok = false;
            }
 
            System.out.println(ok ? "YES" : "NO");
        }
    }
}