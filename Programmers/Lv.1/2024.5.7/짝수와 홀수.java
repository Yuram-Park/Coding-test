// 나의 풀이

class Solution {
    public String solution(int num) {
        String answer = "Odd";
        if(num % 2 == 0){
            answer = "Even";
        }
        return answer;
    }
}

// 다른사람 풀이
// 삼항식 사용
public class EvenOrOdd {
    String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
    }
}