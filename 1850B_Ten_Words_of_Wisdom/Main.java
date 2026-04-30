import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), bs = -1, bi = -1;
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                if (a <= 10 && b > bs) { bs = b; bi = i; }
            }
            System.out.println(bi);
        }
        sc.close();
    }
}