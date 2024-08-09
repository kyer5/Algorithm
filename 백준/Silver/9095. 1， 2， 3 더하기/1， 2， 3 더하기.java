import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            ArrayList<Integer> num = new ArrayList<>();
            num.add(1);
            num.add(2);
            num.add(4);

            for (int i = 3; i < n; i++) {
                int a = num.get(i - 1) + num.get(i - 2) + num.get(i - 3);
                num.add(a);
            }
            System.out.println(num.get(n - 1));
        }
    }
}
