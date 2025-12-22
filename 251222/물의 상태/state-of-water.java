import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int water = sc.nextInt();

        if (water < 0) {
            System.out.println("ice");
        } else if (water >= 100) {
            System.out.println("vapor");
        } else {
            System.out.println("water");
        }
    }
}