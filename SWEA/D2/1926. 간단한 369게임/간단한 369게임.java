import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int x = i;
            int count = 0;

            while (x > 0) {
                int d = x % 10;
                if (d == 3 || d == 6 || d == 9) count++;
                x /= 10;
            }

            if (count == 0) {
                System.out.print(i + " ");
            } else {
                for (int k = 0; k < count; k++) System.out.print("-");
                System.out.print(" ");
            }
        }
    }
}
