import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), e = 0, o = 0;
            int[] arr = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) e++; else o++;
            }
            System.out.println(o == e ? "YES" : "NO");
        }
        sc.close();
    }
}