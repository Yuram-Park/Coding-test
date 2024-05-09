// 나의 풀이

import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        List<String> list = Arrays.asList(seoul);
        String answer = "";
        int idx = list.indexOf("Kim");
        answer = "김서방은 " + idx + "에 있다";
        return answer;
    }
}

// 다른사람 풀이
// for문이 속도가 더 빠르다. or StringBuilder

return new StringBuilder("김서방은 ").append(x).append("에 있다");