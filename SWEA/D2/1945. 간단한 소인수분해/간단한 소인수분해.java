import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[] primeCount = new int[12];

            int[] primes = {2, 3, 5, 7, 11};

            for (int p : primes) {
                while (n % p == 0) {
                    primeCount[p]++;
                    n /= p;
                }
            }

            System.out.print("#" + t + " ");
            for (int p : primes) {
                System.out.print(primeCount[p] + " ");
            }
            System.out.println();
        }
    }
}
