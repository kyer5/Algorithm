import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] results = new int[T];
        for (int test_case = 0; test_case < T; test_case++) {
            for(int i = 0; i < 10; i++) {
                int number = sc.nextInt();
                if (number % 2 == 1) {
                    results[test_case] += number;
                }
            }
            System.out.println("#" + (test_case + 1) + " " + results[test_case]);
        }
    }
}