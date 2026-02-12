import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = -1;
        while (++i < n) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int e = (b > a ? 1 : 0) + (c > a ? 1 : 0) + (d > a ? 1 : 0);
            System.out.println(e);
        }
        sc.close();
    }
}
