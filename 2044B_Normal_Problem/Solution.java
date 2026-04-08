import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            char[] arr = new char[n];
            for (int i = 0; i < n; i++) {
                if (s.charAt(n - 1 - i) == 'p') arr[i] = 'q';
                else if (s.charAt(n - 1 - i) == 'q') arr[i] = 'p';
                else arr[i] = 'w';
            }
            System.out.println(arr);
        }
        sc.close();
    }
}