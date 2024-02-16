import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = 1;
        if(x > 0) {
            if(y < 0) {
                result = 4;
            }
        } else {
            if(y > 0) {
                result = 2;
            } else {
                result = 3;
            }
        }
        System.out.println(result);
    }
}