import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 0;
        if (a == b || a == c || b == c) {
            if (a == b && a == c) {
                result = 10000 + a * 1000;
            } else {
            int temp = b;
            if (a == b || a == c) temp = a;
            result = 1000 + temp * 100;
            }
        } else {
            result = Math.max(a, Math.max(b, c));
            result *= 100;
        }
        System.out.println(result);
    }
}