// 나의 풀이

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer = answer + a[i] * b[i];
        }
        return answer;
    }
}

// Stream으로 풀어보기

import java.util.stream.IntStream;
class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i => a[i] * b[i]).sum();
    }
}