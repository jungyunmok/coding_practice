class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length-2; i++) {
            int first = i + 1;
            while(first < number.length-1) {
                int second = first + 1;
                while(second < number.length) {
                    if(number[i] + number[first] + number[second] == 0) answer++;
                    second++;
                }
                first++;
            }
        }
        return answer;
    }
}