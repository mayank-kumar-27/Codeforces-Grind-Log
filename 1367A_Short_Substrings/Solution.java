import java.util.Scanner;
public class Solution {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next(), r = "" + s.charAt(0);
            for (int i = 1; i < s.length(); i += 2) r += s.charAt(i);
            System.out.println(r);
        }
        sc.close();
    }
}