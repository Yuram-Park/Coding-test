// 나의 풀이

import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int[] answer = {};
        
        if(n == 1){
            answer = Arrays.copyOfRange(num_list, 0, b+1);
        } else if(n == 2){
            answer = Arrays.copyOfRange(num_list, a, num_list.length);
        } else if(n == 3){
            answer = Arrays.copyOfRange(num_list, a, b+1);
        } else if(n == 4){
            int length = (int) Math.ceil((double) (b-a+1) / c);
            answer = new int[length];
            int idx = 0;
            for(int i=a; i<=b; i+=c){
                answer[idx] = num_list[i];
                idx++;
            }
        }
        
        return answer;
    }
}

// 다른사람 풀이

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}