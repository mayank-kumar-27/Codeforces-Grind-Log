import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), c = 0;
        for (int a = 0; a <= 1000; a++) {
            int b = n - a * a;
            if (b >= 0 && a + b * b == m) c++;
        }
        System.out.println(c);
        sc.close();
    }
}
