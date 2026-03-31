import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int d = arr[1] - arr[0];
            for (int i = 1; i < n; i++) if (arr[i] - arr[i - 1] < d) d = arr[i] - arr[i - 1];
            System.out.println(d);
        }
        sc.close();
    }
}