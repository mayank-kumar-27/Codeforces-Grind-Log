import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int m = a > b ? a : b, n = a < b ? a : b;
            int i = 0;
            while (m > n) { m -= c; n += c; i++; }
            System.out.println(i);
        }
        sc.close();
    }
}