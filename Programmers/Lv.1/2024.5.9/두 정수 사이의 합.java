// 나의 풀이

import java.util.*;
class Solution {
    public long solution(int a, int b) {
        int[] arr = {a, b};
        Arrays.sort(arr);
        
        long answer = 0;
        for(int i=arr[0]; i<=arr[1]; i++){
            answer += i;
        }
        return answer;
    }
}

// 다른사람 풀이
// 등차수열의 합을 메서드로 만들어서 풀이
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}