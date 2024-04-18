// 나의 풀이

import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String[] arr = my_string.split("");
        String[] arr2 = my_string.substring(s,e+1).split("");
        for(int i=0; i<arr2.length; i++){
            arr[s+i] = arr2[arr2.length-1-i];
        }
        String answer = "";
        for(String a : arr){
            answer += a;
        }
        return answer;
    }
}

// 다른사람 풀이

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }
}