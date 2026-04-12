import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(a);
            if (a[0] == a[n - 1]) {
                sb.append("NO\n");
                continue;
            }
            sb.append("YES\n").append(a[n - 1]);
            for (int i = 0; i < n - 1; i++) sb.append(' ').append(a[i]);
            sb.append('\n');
        }
        System.out.print(sb);
    }
}