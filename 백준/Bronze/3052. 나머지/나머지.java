import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> remainList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            int remain = number % 42;
            if (!remainList.contains(remain)) {
                remainList.add(remain);
            }
        }
        System.out.println(remainList.size());
    }
}