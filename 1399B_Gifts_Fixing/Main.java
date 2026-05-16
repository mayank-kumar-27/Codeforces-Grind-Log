import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n], b = new long[n];
            long ma = Long.MAX_VALUE, mb = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) { a[i] = sc.nextLong(); ma = Math.min(ma, a[i]); }
            for (int i = 0; i < n; i++) { b[i] = sc.nextLong(); mb = Math.min(mb, b[i]); }
            long r = 0;
            for (int i = 0; i < n; i++) {
                long da = a[i] - ma, db = b[i] - mb;
                r += Math.max(da, db);
            }
            System.out.println(r);
        }
        sc.close();
    }
}