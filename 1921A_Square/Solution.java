import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            int c = sc.nextInt(), d = sc.nextInt();
            int e = sc.nextInt(), f = sc.nextInt();
            int g = sc.nextInt(), h = sc.nextInt();

            int i = e - a, j = f - b;
            int k = g - c, l = h - d;

            int m = (i == 0) ? j : i;
            int n = (k == 0) ? l : k;
            System.out.println(Math.abs(m * n));
        }
        sc.close();
    }
}