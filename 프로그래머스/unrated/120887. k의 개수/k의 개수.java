class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kNum = String.valueOf(k);
        for(int l=i; l<=j; l++) {
            String number = String.valueOf(l);
            if(number.contains(kNum)) {
                for(String str : number.split("")) {
                    if(str.equals(kNum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}