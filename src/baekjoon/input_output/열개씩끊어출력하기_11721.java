package baekjoon.input_output;

import java.util.Scanner;

public class 열개씩끊어출력하기_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
