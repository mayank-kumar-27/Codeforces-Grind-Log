import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            int c = a > b ? a - b : b - a;
            System.out.println(c % 10 == 0 ? c / 10 : (c / 10) + 1);
        }
        sc.close();
    }
}