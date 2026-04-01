import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int o = 0, e = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 != 0) o++;
                else e++;
            }
            if (o == 0) System.out.println("NO");
            else if (e > 0) System.out.println("YES");
            else System.out.println(o % 2 == 1 ? "YES" : "NO");
        }
        sc.close();
    }
}