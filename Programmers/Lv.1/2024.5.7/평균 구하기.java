// 나의 풀이

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int a : arr){
            answer += a;
        }
        answer /= arr.length;
        
        return answer;
    }
}

// 다른사람 풀이
// stream 활용
import java.util.*;
import java.lang.*;

class Solution {
    public double solution(int[] arr) {

        return Arrays.stream(arr).average().getAsDouble();
    }
}