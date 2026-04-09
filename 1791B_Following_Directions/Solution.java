import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = 0, y = 0;
            String s = sc.next();
            boolean o = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'U') y++;
                else if (s.charAt(i) == 'D') y--;
                else if (s.charAt(i) == 'R') x++;
                else x--;
                if (x == 1 && y == 1) { o = true; }
            }
            System.out.println(o ? "YES" : "NO");
        }
        sc.close();
    }
}