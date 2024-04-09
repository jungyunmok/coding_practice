import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int answer = 0;
        for(String str : input) {
            if(!str.equals("")) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}