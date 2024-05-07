// 나의 풀이

import java.util.*;
class Solution {
    public long solution(long n) {
        String nStr = n + "";
        int len = nStr.length();
        
        char[] nArr = nStr.toCharArray();
        
        Arrays.sort(nArr);
        
        long answer = 0;
        
        for(int i=len-1; i>=0; i--){
            answer = answer + (nArr[i] -'0');
            answer *= 10;
        }
        return answer / 10;
    }
}

// 다른사람 풀이
// StringBuilder의 reverse()

import java.util.*;

class Solution {
  public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
  }
}