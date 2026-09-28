import java.util.Scanner;
 
public class Solution {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a[] = new int[n], m = 1001, u = 1, v = n;
        for (int i = 0; i < n; i++) a[i] = s.nextInt();
        
        m = Math.abs(a[0] - a[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            int d = Math.abs(a[i] - a[i + 1]);
            if (d < m) {
                m = d;
                u = i + 1;
                v = i + 2;
            }
        }
        System.out.print(u + " " + v);
    }
}