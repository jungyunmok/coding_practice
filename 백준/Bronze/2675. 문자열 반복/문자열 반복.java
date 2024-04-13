import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] answer = new String[number];
        Arrays.fill(answer, "");
        for (int i = 0; i < number; i++) {
            int count = scanner.nextInt();
            String str = scanner.next();
            for (int j = 0; j < str.length(); j++) {
                answer[i] += str.substring(j, j + 1).repeat(count);
            }
        }
        for(String result : answer) {
            System.out.println(result);
        }
    }
}