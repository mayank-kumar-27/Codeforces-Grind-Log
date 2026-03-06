import java.util.Scanner;
public class Solution {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(), w = sc.nextInt();
        int m = Math.max(y, w);
        int n = 6 - m + 1;
        int gcd = gcd(n, 6);
        System.out.printf("%d/%d", n / gcd, 6 / gcd);
        sc.close();
    }
}