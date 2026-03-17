import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "codeforces";
        while (t-- > 0) {
            int n = 0;
            String r = sc.next();
            for (int i = 0; i < s.length(); i++) if (s.charAt(i) != r.charAt(i)) n++;
            System.out.println(n);
        }
        sc.close();
    }
}