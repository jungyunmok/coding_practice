import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    while (str.length() > 10) {
      System.out.println(str.substring(0, 10));
      str = str.substring(10);
    }
    System.out.println(str);
  }
}