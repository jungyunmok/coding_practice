import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum1 = a*(b%10);
        int sum2 = a*(b%100/10);
        int sum3 = a*(b/100);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum1+(sum2*10)+(sum3*100));
    }
}