import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 4 != 0) { System.out.println("NO"); continue; }
            System.out.println("YES");
            int h = n / 2, e = 0, o = 0;
            for (int i = 1; i <= h; i++) { int v = 2 * i; System.out.print(v + " "); e += v; }
            for (int i = 1; i < h; i++) { int v = 2 * i - 1; System.out.print(v + " "); o += v; }
            System.out.println(e - o);
        }
        sc.close();
    }
}