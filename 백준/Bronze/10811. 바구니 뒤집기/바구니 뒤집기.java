import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split(" ");
        int n = Integer.parseInt(inputArr[0]);
        int m = Integer.parseInt(inputArr[1]);
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = i + 1;
        }
        int[] temp = answer.clone();
        for (int j = 0; j < m; j++) {
            input = br.readLine();
            inputArr = input.split(" ");
            int start = Integer.parseInt(inputArr[0]) - 1;
            int end = Integer.parseInt(inputArr[1]) - 1;
            int length = end-start == 1 ? 1 : (end-start)%2==0 ? (end-start)/2 : (end-start)/2+1;
            for (int k = 0; k < length; k++) {
                temp[start + k] = answer[end - k];
                temp[end - k] = answer[start + k];
            }
            answer = temp.clone();
        }
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}