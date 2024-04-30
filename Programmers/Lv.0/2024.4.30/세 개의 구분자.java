// 나의 풀이

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answers = myStr.split("a|b|c");
        List<String> list = new ArrayList<>();
        
        if(answers.length == 0){
            String[] empty = new String[1];
            empty[0] = "EMPTY";
            return empty;
        } else{
            for(String answer : answers){
                if(answer.equals("")){
                    continue;
                }
                list.add(answer);
            }
            return list.toArray(new String[0]);
        }
    }
}

// 다른사람 풀이 1
// StringTokenizer 사용

import java.util.StringTokenizer;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(myStr,"abc");
        if(st.countTokens() != 0){
            answer = new String[st.countTokens()];
            for(int i=0; i<answer.length; i++){
                answer[i] = st.nextToken();
            }
        }else{
            answer = new String[1];
            answer[0] = "EMPTY";
        }

        return answer;
    }
}


// 다른사람 풀이 2
// 정규식 표현 사용

import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr.equals("") ? "EMPTY" : myStr;

        return myStr.split("[,]");
    }
}
