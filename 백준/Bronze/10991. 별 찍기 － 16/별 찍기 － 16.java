import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for (int i=1; i<=n; i++) {
      for (int j=i; j<=n-1; j++) {
        System.out.print(" ");
      }
      for (int k=1; k <=i*2-1; k++) {
        if(k%2 == 0) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}