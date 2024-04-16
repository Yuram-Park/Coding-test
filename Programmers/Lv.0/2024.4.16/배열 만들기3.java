// 나의 풀이

import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for(int[] a : intervals){
            for(int i=a[0]; i<=a[1]; i++){
                list.add(arr[i]);
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

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        int s1 = intervals[0][0], e1 = intervals[0][1], s2 = intervals[1][0], e2 = intervals[1][1], idx = 0;
        int[] answer = new int[e1 - s1 + e2 - s2 + 2];

        for (int i = s1; i <= e1; i++) {
            answer[idx++] = arr[i];
        }

        for (int i = s2; i <= e2; i++) {
            answer[idx++] = arr[i];
        }

        return answer;
    }
}