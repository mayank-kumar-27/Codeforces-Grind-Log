import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), a = 0, t = 0;
        for (int i = 1; i <= n; i++) {
            t += 5 * i;
            if ((t + k) > 240) break;
            a++;
        }
        System.out.println(a);
        sc.close();
    }
}
