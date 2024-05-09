package baekjoon.input_output;

import java.util.Scanner;

public class APlusB_4_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            while (true) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a <= 0 || b >= 10) {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                } else {
                    System.out.println(a + b);
                    break;
                }
            }
        }
    }
}
