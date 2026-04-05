import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int m = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > m) { m2 = m; m = arr[i]; } 
                else if (arr[i] > m2) m2 = arr[i];
            }
            for (int i = 0; i < n; i++) System.out.print(arr[i] == m ? arr[i] - m2 + " " : arr[i] - m + " ");
            System.out.println();
        }
        sc.close();
    }
}