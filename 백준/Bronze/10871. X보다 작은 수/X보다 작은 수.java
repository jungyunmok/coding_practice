import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        String numArr[] = number.split(" ");
        String input = br.readLine();
        String inputArr[] = input.split(" ");
        for (int i = 0; i < inputArr.length; i++) {
            if(Integer.parseInt(inputArr[i]) < Integer.parseInt(numArr[1])) System.out.print(inputArr[i] + " ");
        }
    }
}