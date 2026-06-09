import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = 0;
            for (int i = 0; i < n; i++) x ^= sc.nextInt();
            if (n % 2 == 1) System.out.println(x);
            else System.out.println(x == 0 ? 0 : -1);
        }
        sc.close();
    }
}