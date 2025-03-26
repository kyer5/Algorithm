import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stackInt = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    stackInt.push(Integer.valueOf(input[1]));
                    break;
                case "pop":
                    System.out.println(stackInt.isEmpty() ? -1 : stackInt.pop());
                    break;
                case "size":
                    System.out.println(stackInt.size());
                    break;
                case "empty":
                    System.out.println(stackInt.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(stackInt.isEmpty() ? -1 : stackInt.peek());
                    break;
            }
        }

    }
}