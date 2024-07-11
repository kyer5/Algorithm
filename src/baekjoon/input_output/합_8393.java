package baekjoon.input_output;

import java.util.Scanner;

public class 합_8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        if (n < 1 || n > 10000) {
            System.out.println("잘못된 입력입니다.");
        }

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
