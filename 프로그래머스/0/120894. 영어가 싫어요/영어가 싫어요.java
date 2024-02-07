import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String strNumbers = "";
        int index = 0;
        Map<String, String> numberMap = Map.of("zero", "0", "one", "1", "two", "2", "three", "3", "four", "4", "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9");
        while(index <= numbers.length()-3) {
            for(int i=3; i<=5; i++) {
                if(numberMap.containsKey(numbers.substring(index, index+i))) {
                    strNumbers += numberMap.get(numbers.substring(index, index+i));
                    index += i;
                    break;
                }
            }
        }
        answer = Long.parseLong(strNumbers);
        return answer;
    }
}