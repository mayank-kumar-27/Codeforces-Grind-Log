import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            boolean ok = true;
            for (int i = 0; i < n - 1; i++) if (a[i] > a[i + 1]) { ok = false; break; }
            if (!ok) { System.out.println(0); continue; }
            int m = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) m = Math.min(m, a[i + 1] - a[i]);
            System.out.println(m / 2 + 1);
        }
        sc.close();
    }
}