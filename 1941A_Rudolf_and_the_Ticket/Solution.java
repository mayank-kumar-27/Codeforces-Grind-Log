import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), c = 0;
            int[] a = new int[n], b = new int[m];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) if (a[i] + b[j] <= k) c++;
            System.out.println(c);
        }
        sc.close();
    }
}