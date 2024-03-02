import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            numberList.add(i);
        }
        for (int j = 0; j < 28; j++) {
            String strNumber = br.readLine();
            int number = Integer.parseInt(strNumber);
            numberList.remove(Integer.valueOf(number));
        }
        for (int value : numberList) {
            System.out.println(value);
        }
    }
}