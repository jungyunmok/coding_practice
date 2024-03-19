class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max = -257;
        int min = 257;
        int index = 0;
        for(int i=0; i<dots.length; i++) {
            max = dots[i][index] > max ? dots[i][index] : max;
            min = dots[i][index] < min ? dots[i][index] : min;
                if(i == dots.length-1 && answer == 0) {
                    answer = max - min;
                    index++;
                    i = 0;
                    max = -257;
                    min = 257;
                }
        }
        answer *= max-min;
        return answer;
    }
}