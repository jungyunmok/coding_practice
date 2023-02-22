package programmers_100;

import java.time.LocalDate;

// 나이 출력
public class q007 {
  // 2022년 고정일 경우
  public int solution1(int age) {
    int answer = -1;
    if (age > 0 && age <= 120) {
      answer = 2022 - age + 1;
    }
    return answer;
  }

  // 다른 풀이 -> 2022 고정x, 변동
  public int solution2(int age) {
    // LocalDate - 로컬 컴퓨터의 현재 날짜 정보
    LocalDate today = LocalDate.now();
    // getYear - 해당 날짜 객체의 연도 필드값 반환
    return today.getYear() - age + 1;
  }
}
