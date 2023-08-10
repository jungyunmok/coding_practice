import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int num[] = new int[n];
    for(int i=0; i<n; i++) {
      num[i] = scan.nextInt();
    }
    Arrays.sort(num);
    int min = num[0];
    int max = num[n-1];
    System.out.println(min + " " + max);
  }
}