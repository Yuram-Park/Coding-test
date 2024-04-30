// 나의 풀이

import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    list.add(arr[i]);
                }
            } else{
                for(int k=0; k<arr[i]; k++){
                    list.remove(list.size()-1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

// 다른사람 풀이
// String으로 변환해서 처리
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        String answer = "";

        for(int idx=0; idx<arr.length; idx++) {
            if(flag[idx]) {
                answer += String.valueOf(arr[idx]).repeat(arr[idx]*2);
            }
            else {
                answer = answer.substring(0, answer.length() - arr[idx]);
            }
        }

        return Stream.of(answer.split("")).mapToInt(Integer::parseInt).toArray();
    }
}