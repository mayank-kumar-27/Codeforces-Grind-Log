import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c1, c2;
            if (n % 3 == 0) { c1 = n / 3; c2 = n / 3; } 
            else if (n % 3 == 1) { c1 = (n + 2) / 3; c2 = (n - 1) / 3; } 
            else { c1 = (n - 2) / 3; c2 = (n + 1) / 3; }
            System.out.println(c1 + " " + c2);
        }
        sc.close();
    }
}