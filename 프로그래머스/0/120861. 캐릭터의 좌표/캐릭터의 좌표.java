class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xMax = board[0]/2;
        int yMax = board[1]/2;
        int x = 0;
        int y = 0;
        for(String str : keyinput) {
            if(str.equals("up")) {
                y++;
            } else if(str.equals("down")) {
                y--;
            } else if(str.equals("left")) {
                x--;
            } else if(str.equals("right")) {
                x++;
            }
            if(x > xMax || x < xMax*-1) x = x > 0 ? xMax : xMax*-1;
            if(y > yMax || y < yMax*-1) y = y > 0 ? yMax : yMax*-1;
        }
        int[] answer = {x, y};
        return answer;
    }
}