import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            int num = 0;
            if (cmd.equals("push")) {
                num = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "push":
                    stack.push(num);
                    break;
                case "pop":
                    if (stack.empty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.empty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "top":
                    if (stack.empty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}