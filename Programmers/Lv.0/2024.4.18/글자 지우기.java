// 나의 풀이

import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        List<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        Arrays.sort(indices);
        for(int i=indices.length-1; i>=0; i--){
            list.remove(indices[i]);
        }
        String answer = "";
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}

// 다른사람 풀이

class Solution {

    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }
}