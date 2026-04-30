import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m = sc.nextInt(), n = sc.nextInt();
        int i = 0;
        while (m / n > 0.75) { i++; n++; }
        System.out.println(m / n < 0.75 ? i - 1 : i);
        sc.close();
    }
}