import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.println(Math.round(a * 1000) / 1000.0);
        System.out.println(Math.round(b * 1000) / 1000.0);
        System.out.println(Math.round(c * 1000) / 1000.0);
    }
}