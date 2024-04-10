import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String[] input = br.readLine().split("");
        String[][] strNum = {{"A","B","C"}, {"D","E","F"}, {"G","H","I"}, {"J","K","L"}, {"M","N","O"}, {"P","Q","R", "S"}, {"T","U","V"}, {"W","X","Y","Z"}};
        for(String str : input) {
            for (int i = 0; i < strNum.length; i++) {
                if(Arrays.stream(strNum[i]).anyMatch(str::equals)) {
                    answer += i+3;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}