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
        Arrays.fill(answer, 0);
        for (int i = 0; i < m; i++) {
            String numbers = br.readLine();
            String[] temp = numbers.split(" ");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);
            int num = Integer.parseInt(temp[2]);
            for (int j = start - 1; j < end; j++) {
                answer[j] = num;
            }
        }
        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}