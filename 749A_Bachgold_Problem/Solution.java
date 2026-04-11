import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            int k = n / 2;
            System.out.println(k);
            for (int i = 0; i < k; i++) System.out.print("2 ");
        } else {
            int k = (n - 3) / 2;
            System.out.println(k + 1);
            for (int i = 0; i < k; i++) System.out.print("2 ");
            System.out.print("3");
        }
        sc.close();
    }
}