// 나의 풀이

import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        int[] answer = {};
        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}

// stream 이용해서 풀어보기
import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(i => i % divisor == 0).toArray();
          if(answer.length == 0){
            answer = new int[1] {-1};
          }

          return answer;
  }
}
