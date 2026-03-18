import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), c = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x <= 5 - k) c++;
        }
        System.out.println(c / 3);
        sc.close();
    }
}