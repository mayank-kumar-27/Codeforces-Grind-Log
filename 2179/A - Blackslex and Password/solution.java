import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int k = s.nextInt();
            int x = s.nextInt();
            System.out.println(k * x + 1);
        }
    }
}