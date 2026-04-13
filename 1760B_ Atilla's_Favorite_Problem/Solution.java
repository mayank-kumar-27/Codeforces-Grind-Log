import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char m = 'a';
            for (int i = 0; i < n; i++) if (s.charAt(i) > m) m = s.charAt(i);
            System.out.println(m - 'a' + 1);
        }
        sc.close();
    }
}