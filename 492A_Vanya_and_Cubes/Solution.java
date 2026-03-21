import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0, t = 0;
        while (true) {
            l++;
            t += (l * (l + 1)) / 2;
            if (t > n) { l--; break; }
        }
        System.out.print(l);
        sc.close();
    }
}