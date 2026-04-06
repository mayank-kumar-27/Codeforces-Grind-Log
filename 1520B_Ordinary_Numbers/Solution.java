import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int d = n.length(), f = n.charAt(0) - '0';
            int r = 9 * (d - 1) + f;
            String re = String.valueOf(n.charAt(0)).repeat(d);
            if (re.compareTo(n) > 0) r--;
            System.out.println(r);
        }
        sc.close();
    }
}