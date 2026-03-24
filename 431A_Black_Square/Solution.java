import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), r = 0;
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 1) r += a;
            else if (s.charAt(i) - '0' == 2) r += b;
            else if (s.charAt(i) - '0' == 3) r += c;
            else r += d;
        }
        System.out.println(r);
        sc.close();
    }
}