import java.util.Scanner;
public class Main {
    public static boolean vorc(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) if (!vorc(c)) { r.append('.'); r.append(c); }
        System.out.println(r.toString());
        sc.close();
    }
}