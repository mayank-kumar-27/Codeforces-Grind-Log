import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a == b) System.out.println(c % 2 == 1 ? "First" : "Second");
            else if (a > b) System.out.println("First");
            else System.out.println("Second");
        }
        sc.close();
    }
}