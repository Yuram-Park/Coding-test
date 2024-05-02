// 나의 풀이 1

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int)Math.ceil(n/2.0)];
        int idx = 0;
        for(int i=1; i<=n; i+=2){
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}

// 나의 풀이 2(stream 사용)

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(x -> x % 2 == 1).toArray();
    }
}
