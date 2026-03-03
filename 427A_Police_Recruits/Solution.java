import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0, p = 0;
        while (t-- > 0) {
            int a = sc.nextInt();
            if (a == -1 && p > 0) p--;
            else if (a == -1) c++;
            else p += a;
        }
        System.out.println(c);
        sc.close();
    }
}