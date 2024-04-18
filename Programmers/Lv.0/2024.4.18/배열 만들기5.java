// 나의 풀이

import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String a : intStrs){
            int num = Integer.parseInt(a.substring(s,s+l));
            if(num > k){
                list.add(num);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}