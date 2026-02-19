import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int m = Math.max(a, b), m2 = Math.max(c, d);
            int[] arr = { a, b, c, d };
            Arrays.sort(arr);
            if ((m == arr[3] && m2 == arr[2]) || (m == arr[2] && m2 == arr[3])) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}