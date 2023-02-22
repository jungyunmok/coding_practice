package programmers_100;

// 두 수의 차
public class q002 {
  public int solution1(int num1, int num2) {
    int answer = num1 - num2;
    return answer;
  }

  // 다른 풀이
  public int solution2(int num1, int num2) {
    int answer = 0;
    if ((-50000 <= num1 && num1 <= 50000) && (-50000 <= num1 && num1 <= 50000)) {
      answer = num1 - num2;
    }
    return answer;
  }
}