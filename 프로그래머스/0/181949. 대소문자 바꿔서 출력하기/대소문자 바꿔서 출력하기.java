import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strArr = a.split("");
        String answer = "";
        for(String str : strArr) {
            if(str.equals(str.toLowerCase())) {
                answer += str.toUpperCase();
            } else {
                answer += str.toLowerCase();
            }
        }
        System.out.println(answer);
    }
}