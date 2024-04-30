// 나의 풀이

import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] lengthArr = new int[31];
        
        for(String str : strArr){
            lengthArr[str.length()]++;
        }
        
        Arrays.sort(lengthArr);
        
        return lengthArr[30];
    }
}

// 다른사람 풀이
// Math.max(비교값1, 비교값2)

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        int[] lengArr = new int[31];

        for(int i=0; i<strArr.length; i++) {
            lengArr[strArr[i].length()]++;
        }

        for(int i=0; i<=30; i++) {
            answer = Math.max(answer, lengArr[i]);
        }

        return answer;
    }
}