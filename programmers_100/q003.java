package programmers_100;

// 몫 구하기
public class q003 {
  public int solution1(int num1, int num2) {
    int answer = 0;
    if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
      answer = num1 / num2;
    }
    return answer;
  }

  // 다른 풀이
  public int solution2(int num1, int num2) {
    boolean val = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
    int answer = 0;
    if (val) {
      answer = num1 / num2;
    } else {
      answer = -1;
    }
    return answer;
  }
}
