import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        int[] answer = new int[26];
        Arrays.fill(answer, -1);
        for (int i = 0; i < input.length; i++) {
            int num = input[i].charAt(0) - 97;
            if(answer[num] == -1) answer[num] = i;
        }
        for(int n : answer) {
            System.out.print(n + " ");
        }
    }
}