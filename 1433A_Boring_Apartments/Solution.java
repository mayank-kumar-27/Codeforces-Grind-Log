import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String x = sc.next();
            int d = x.charAt(0) - '0';
            int l = x.length();
            int r = (d - 1) * 10 + (l * (l + 1)) / 2;
            System.out.println(r);
        }
        sc.close();
    }
}