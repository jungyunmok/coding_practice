import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            int temp = 0;
            while(temp < i) {
                System.out.print("*");
                temp++;
            }
            System.out.println();
        }
    }
}