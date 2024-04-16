// 나의 풀이

import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for(int i=my_string.length()-1; i>=0; i--){
            list.add(my_string.substring(i));
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}


// Arrays.sort();