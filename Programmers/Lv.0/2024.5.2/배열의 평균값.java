// 나의 풀이

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int num : numbers){
            answer += num;
        }
        answer /= numbers.length;
        return answer;
    }
}


// 다른사람 풀이
// Arrays.stream() 사용법 익히기

import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        
        return Arrays.stream(numbers).average().orElse(0);
    }
}

