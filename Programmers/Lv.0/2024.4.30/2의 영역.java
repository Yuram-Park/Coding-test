// 나의 풀이

import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int a : arr){
            list.add(a);
        }
        
        int firstIdx = list.indexOf(2);
        int lastIdx = list.lastIndexOf(2);
        
        int[] answer = {};
        
        if(firstIdx == -1){
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = Arrays.copyOfRange(arr, firstIdx, lastIdx + 1);
        }
         
        
        return answer;
    }
}

// 다른사람 풀이
// startIdx 와 endIdx 다르게 넣는 법 참고
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                if(start==-1){
                    start = i;
                }
                end = i;
            }
        }

        if(start==-1){
            answer = new int[]{-1};
        }else{

            answer = Arrays.copyOfRange(arr,start,end+1);
        }



        return answer;
    }
}