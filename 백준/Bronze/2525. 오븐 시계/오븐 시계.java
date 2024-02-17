import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();
        m += time;
        while (m > 59) {
            m -= 60;
            h++;
        }
        if (h > 23) h -= 24;
        System.out.println(h + " " + m);
    }
}