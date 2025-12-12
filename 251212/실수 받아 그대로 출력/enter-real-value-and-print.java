import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();

        System.out.println(Math.round(n * 100) / 100.0);
    }
}