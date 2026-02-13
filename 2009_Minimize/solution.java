import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = -1;
        while (++i<n) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(b-a);
        }
        sc.close();
    }
}
