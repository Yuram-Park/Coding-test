// 나의 풀이

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer;
    }
}

// 다른사람 풀이
// n/2 까지만 반복문을 돌면 된다.

class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
    for(int i =1 ; i<=num/2;i++){
      if(num%i==0){
        answer+=i;}}


        return answer+num;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        SumDivisor c = new SumDivisor();
        System.out.println(c.sumDivisor(12));
    }
}