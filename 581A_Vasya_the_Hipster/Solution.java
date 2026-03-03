import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int m = Math.max(a, b), n = Math.min(a, b);
        System.out.printf("%d %d", n, (m - n) / 2);
        sc.close();
    }
}