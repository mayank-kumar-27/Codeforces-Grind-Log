import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long l = sc.nextLong(), r = sc.nextLong();
            System.out.println((2 * l <= r) ? l + " " + (2 * l) : "-1 -1");
        }
        sc.close();
    }
}