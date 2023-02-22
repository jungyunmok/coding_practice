package programmers_100;

// 숫자 비교하기
public class q004 {
  public int solution1(int num1, int num2) {
    int answer = 0;
    if (num1 == num2) {
      answer = 1;
    } else {
      answer = -1;
    }
    return answer;
  }

  // 다른 풀이
  public int solution2(int num1, int num2) {
    // 삼항연산자 사용 - 두 수의 값이 같으면 1, 다르면 -1
    int answer = (num1 == num2) ? 1 : -1;
    return answer;
  }
}
