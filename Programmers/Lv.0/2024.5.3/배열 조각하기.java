// 나의 풀이

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i=0; i<query.length; i++){
            if(i % 2 == 0){
                int size = list.size() - query[i];
                for(int j=1; j<size; j++){
                    list.remove(list.size()-1);
                }
            } else{
                for(int j=0; j<query[i]; j++){
                    list.remove(0);
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
// 시작값과 끝값만 알아서 복사
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
}