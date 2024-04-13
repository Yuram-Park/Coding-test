// 나의 풀이

import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            if(i % 5 == 0){
                answer.add(names[i]);
            }
        }
        return answer.toArray(new String[0]);
    }
}

// 다른사람 풀이

class Solution {
    public String[] solution(String[] names) {
        int idx = 0;
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        for (int i = 0;i < names.length;i+=5)
            answer[idx++] = names[i];
        return answer;
    }
}
