import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = "F";
        if(a >= 90) {
            result = "A";
        } else if(a >= 80) {
            result = "B";
        } else if(a >= 70) {
            result = "C";
        } else if(a >= 60) {
            result = "D";
        }
        System.out.println(result);
    }
}