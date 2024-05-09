package baekjoon.input_output;

import java.util.Scanner;

public class APlusB_6_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            String[] str = sc.next().split(",");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            System.out.println(a + b);
        }
    }
}
