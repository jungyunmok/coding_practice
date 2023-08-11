import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for (int i=1; i<n; i++) {
      for (int j=i; j<=n-1; j++) {
        System.out.print(" ");
      }
      for (int k=1; k <i*2; k++) {
        if(k%2 == 1 && (k==1 || k==i*2-1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int j=0; j<n*2-1; j++) {
      System.out.print("*");
    }
  }
}