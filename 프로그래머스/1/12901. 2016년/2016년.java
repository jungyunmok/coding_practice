class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int totalDate = 0;
        for(int i=1; i<a; i++) {
            if(i == 2) {
                totalDate += 29;
            } else if((i < 8 && i % 2 != 0) || (i > 7 && i % 2 == 0)) {
                totalDate += 31;
            } else {
                totalDate += 30;
            }
        }
        totalDate += b;
        answer = days[totalDate%days.length];
        return answer;
    }
}