import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();
            if (cmd.contains("push")){
                String push = cmd.split(" ")[1];
                queue.add(Integer.valueOf(push));
                last = Integer.parseInt(push);
            }
            else if (cmd.equals("pop")) {
                if (queue.size() == 0) {
                    System.out.println("-1");
                }
                else {
                    System.out.println(queue.peek());
                    queue.remove();
                }
            }
            else if (cmd.equals("size")) {
                System.out.println(queue.size());
            }
            else if (cmd.equals("empty")) {
                if (queue.size() == 0) {
                    System.out.println("1");
                }
                else {
                    System.out.println("0");
                }            }
            else if (cmd.equals("front")) {
                if (queue.size() == 0) {
                    System.out.println("-1");
                }
                else {
                    System.out.println(queue.peek());
                }
            }
            else if (cmd.equals("back")) {
                if (queue.size() == 0) {
                    System.out.println("-1");
                }
                else {
                    System.out.println(last);
                }
            }
        }
    }
}
