import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num1 = 0;
        int num2 = 0;
        for (String str : input) {
            StringBuffer sb = new StringBuffer(str);
            if (num1 == 0) {
                num1 = Integer.parseInt(sb.reverse().toString());
            } else {
                num2 = Integer.parseInt(sb.reverse().toString());
            }
        }
        int answer = Math.max(num1, num2);
        System.out.println(answer);
    }
}