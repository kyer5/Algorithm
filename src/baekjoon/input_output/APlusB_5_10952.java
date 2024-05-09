package baekjoon.input_output;

import java.util.Scanner;

public class APlusB_5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }
        }
    }
}
