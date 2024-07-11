package baekjoon.input_output;

import java.util.Scanner;

public class 최소최대_10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];
        int max = 0;
        int min = 1000001;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nArr[i] = num;
        }

        for (int i = 0; i < nArr.length; i++) {
            if (max < nArr[i]) {
                max = nArr[i];
            }
            if (min > nArr[i]) {
                min = nArr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
