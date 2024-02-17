import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt() - 45;
        if(m < 0) {
            m += 60;
            h--;
        }
        if(h < 0) h += 24;
        System.out.println(h + " " + m);
    }
}