// 나의 풀이

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = n + "";

        char[] nArr = nStr.toCharArray();
        
        for(char c : nArr){
            int add = c - '0';
            answer += add;
        }
        
        return answer;
    }
}

// 다른사람 풀이
// 타입 변환 없이 10으로 나눠주며 더해주기
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }
        return answer;
    }
}