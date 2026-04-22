import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String exp = br.readLine();

        double[] values = new double[26];

        for (int i = 0; i < n; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                stack.push(values[ch - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();

                if (ch == '+') {
                    stack.push(a + b);
                } else if (ch == '-') {
                    stack.push(a - b);
                } else if (ch == '*') {
                    stack.push(a * b);
                } else if (ch == '/') {
                    stack.push(a / b);
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}