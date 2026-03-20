import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            char[] s3 = s1.toCharArray();
            char[] s4 = s2.toCharArray();
            Arrays.sort(s3);
            Arrays.sort(s4);
            boolean v = true;
            for (int i = 0; i < n; i++) if (s3[i] != s4[i]) { v = false; break; }
            System.out.println(v ? "YES" : "NO");
        }
        sc.close();
    }
}