import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong();
            if (n % 2 == 0) System.out.println("YES");
            else {
                if (k % 2 == 1 && k <= n) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}