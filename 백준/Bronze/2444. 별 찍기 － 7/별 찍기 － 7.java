import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(n-1-i)+"*".repeat(i*2+1));
        }
        for (int j = n-2; j >= 0; j--) {
            System.out.println(" ".repeat(n-1-j)+"*".repeat(j*2+1));
        }
    }
}