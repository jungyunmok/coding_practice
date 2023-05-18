class Solution {
    public int solution(int price) {
        int answer = 0;
        answer = 
            (int)(price >= 100000 ? (
            price >= 300000 ? (
            price >= 500000 ? (
                price * 0.80
            ) : (price * 0.90)
            ) : (price * 0.95)
            ) : price);
            return answer;
    }
}