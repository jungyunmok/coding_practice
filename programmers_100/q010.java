package programmers_100;

import java.util.Arrays;

// 배열의 평균값
public class q010 {
  public double solution1(int[] numbers) {
    double answer = 0;
    for (int i = 0; i < numbers.length; i++) {
      answer += numbers[i];
    }
    answer /= numbers.length;
    return answer;
  }

  // 다른 풀이
  public double solution2(int[] numbers) {
    // Arrays.stream(numbers).average()로 배열의 평균을 구함
    // orElse(0) - 주어진 값이 null이 아닌 경우 주어진 값 반환, null인 경우 인수(0) 반환
    // orElse~는 if문을 이용해 처리해야 하는 명령어를 짧게 람다식처럼 처리할 수 있는 메소드
    // orElse를 사용할 때는 Optional의 대상이 되는 값과 orElse 내의 매개변수 리턴 값은 같아야 한다.
    return Arrays.stream(numbers).average().orElse(0);
  }
}

/*
 * 스트림(Stream)
 *  자바8부터 추가된 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자
 *  Iterator와 비슷한 역할을 하지만 람다식으로 요소 처리 코드를 제공하여 코드가 좀 더 간결
 *  내부 반복자를 사용하므로 병렬처리가 쉬움
 *  배열이나 컬렉션(List, Set, Map)으로 원하는 값을 얻을 때 for문 도배를 방지하기 위해 나온 개념
 *  선언 -> 가공 -> 반환 세 부분으로 이뤄짐
 * 
 *  선언 - 배열, 컬렉션(list, set, map) 등을 스트림 형태로 만들기
 *   Stream<데이터타입> stream명 = Arrays.stream(배열명);
 *   Stream<데이터타입> stream명 = 리스트명.stream();
 *   Stream<데이터타입> stream명 = Stream.of('값', '값'....);
 * 
 *   선언하지 않고 바로 사용도 가능
 *   Arrays.stream(배열명).가공메소드...
 *   리스트명.stream.가공메소드...
 * 
 *  가공 - 스트림을 필요한 형태로 가공하기
 *   count(), sorted(), distinct(), average(), sum() 등
 * 
 *  반환 - 가공합 값을 원하는 형태로 가져오기
 *   get(), toArray() 등
 */