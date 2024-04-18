import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];
        double max = 0;
        double answer = 0;
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
            max = input[i] > max ? input[i] : max;
        }
        for (int n : input) {
            answer += n / max * 100;
        }
        answer /= input.length;
        System.out.println(answer);
    }
}