// 나의 풀이

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}

// Stream 이용해보기
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n).filter(x => n % x == 1).findFirst().orElse(0);
    }
}