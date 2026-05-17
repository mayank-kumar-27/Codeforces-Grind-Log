import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), c = 0;
            while (n > 0) { c += Math.min(9, n); n /= 10; }
            System.out.println(c);
        }
        sc.close();
    }
}