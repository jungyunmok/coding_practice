import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        String input = br.readLine();
        String arr[] = input.split(" ");
        String number = br.readLine();
        int answer = 0;
        for(String str : arr) {
            if(number.equals(str)) answer++;
        }
        System.out.println(answer);
    }
}