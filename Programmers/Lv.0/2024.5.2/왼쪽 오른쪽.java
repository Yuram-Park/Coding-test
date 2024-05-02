// 나의 풀이

import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = Arrays.asList(str_list);
        int lIdx = list.indexOf("l");
        int rIdx = list.indexOf("r");
        
        String[] answer = {};
        
        if(lIdx != -1 && rIdx != -1){
            if(lIdx < rIdx){
                answer = new String[lIdx];
                for(int i=0; i<lIdx; i++){
                    answer[i] = str_list[i];
                }
            } else {
                answer = new String[str_list.length - rIdx -1];
                for(int i=rIdx + 1; i<str_list.length; i++){
                    answer[i-rIdx-1] = str_list[i];
                }
            }
        } else if(lIdx != -1 && rIdx == -1){
            answer = new String[lIdx];
            for(int i=0; i<lIdx; i++){
                answer[i] = str_list[i];
            }
        } else if(lIdx == -1 && rIdx != -1){
            answer = new String[str_list.length - rIdx -1];
            for(int i=rIdx + 1; i<str_list.length; i++){
                answer[i-rIdx-1] = str_list[i];
            }
        } else{
            answer = new String[0];
        }
        
        return answer;
    }
}

// 다른사람 풀이

import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {

        for (int i = 0; i < str_list.length; i++) {

            if ("l".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if ("r".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[0];
    }
}