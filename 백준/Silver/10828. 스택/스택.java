import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stackInt = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    int x = Integer.parseInt(input[1]);
                    stackInt.push(x);
                    break;

                case "pop":
                    if (!stackInt.isEmpty()) {
                        System.out.println(stackInt.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;

                case "size":
                    System.out.println(stackInt.size());
                    break;

                case "empty":
                    System.out.println(stackInt.isEmpty() ? 1 : 0);
                    break;

                case "top":
                    if (!stackInt.isEmpty()) {
                        System.out.println(stackInt.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
