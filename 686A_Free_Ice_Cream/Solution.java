import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long in = sc.nextLong(), d = 0;
        while (t-- > 0) {
            String s = sc.next();
            long r = sc.nextLong();
            if (s.equals("+")) in += r;
            else { if (in - r >= 0) in -= r; else d++; }
        }
        System.out.println(in + " " + d);
        sc.close();
    }
}