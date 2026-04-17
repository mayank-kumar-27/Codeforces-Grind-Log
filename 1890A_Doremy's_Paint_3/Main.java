import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                m.put(x, m.getOrDefault(x, 0) + 1);
            }
            if (m.size() > 2) System.out.println("NO");
            else if (m.size() == 1) System.out.println("YES");
            else {
                List<Integer> l = new ArrayList<>(m.values());
                if (Math.abs(l.get(0) - l.get(1)) <= 1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}