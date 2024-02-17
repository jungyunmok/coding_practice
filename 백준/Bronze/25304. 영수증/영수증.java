import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = scanner.nextInt();
        int totalCount = scanner.nextInt();
        int money = 0;
        String result = "No";
        for (int i = 0; i < totalCount; i++) {
            int amount = scanner.nextInt();
            int count = scanner.nextInt();
            money += amount*count;
        }
        if(totalAmount == money) result = "Yes";
        System.out.println(result);
    }
}