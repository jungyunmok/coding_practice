import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        String[] nm = number.split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] answer = new int[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i + 1;
        }
        for (int j = 0; j < m; j++) {
            String numbers = br.readLine();
            String[] temp = numbers.split(" ");
            int index1 = Integer.parseInt(temp[0]) - 1;
            int index2 = Integer.parseInt(temp[1]) - 1;
            int number1 = answer[index1];
            answer[index1] = answer[index2];
            answer[index2] = number1;
        }
        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}