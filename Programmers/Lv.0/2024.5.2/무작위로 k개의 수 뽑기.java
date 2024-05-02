// 나의 풀이

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        
        for(int a : arr){
            if(result.isEmpty()){
                result.add(a);
            } else if(result.size() < k && result.indexOf(a) == -1){
                result.add(a);
            }
        }

        if(result.size() != k) {
            for(int i=result.size(); i<k; i++){
                result.add(-1);
            }
        }
                
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}

// 다른사람 풀이

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a : arr)
            if (!arrayList.contains(a))
                arrayList.add(a);

        int idx = 0;
        int[] answer = new int[k];
        for (int i = 0;i < k;i++)
            answer[i] = -1;
        for (int i = 0;i < k && i < arrayList.size();i++)
            answer[i] = arrayList.get(i);
        return answer;
    }
}