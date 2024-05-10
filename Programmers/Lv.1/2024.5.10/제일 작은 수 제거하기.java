// 나의 풀이

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int minIdx = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIdx = i;
            }
        }
        
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length -1];
            int idx = 0;
            for(int i=0; i<arr.length; i++){
                if(i == minIdx) continue;
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}

// 다른사람 풀이1
// arr.length == 1 일 때 바로 return 가능
// arr.length == 1 일 때를 위로 넣기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
  public int[] solution(int[] arr) {
      if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int a : arr) {
                arrayList.add(a);
            }
            Integer minimum = Collections.min(arrayList);
            arrayList.remove(minimum);
            int[] resultArray = new int[arr.length - 1];
            for (int i = 0; i < arrayList.size(); ++i) {
                resultArray[i] = arrayList.get(i);
            }
            return resultArray;
        }
  }
}


// 다른사람 풀이 2
// stream 사용

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class Solution {
  public int[] solution(int[] arr) {
      if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}