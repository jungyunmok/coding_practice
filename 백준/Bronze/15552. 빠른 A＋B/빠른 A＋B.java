import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            String arr[] = input.split(" ");
            bw.write((Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) + "\n");
        }
        bw.flush();
    }
}