import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            int f = (a - 3) / b + 2;
            System.out.println(a <= 2 ? 1 : f);
        }
        sc.close();
    }
}