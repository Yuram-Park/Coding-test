// 나의 풀이

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String num = i + "";
            
            if(num.contains("1") || num.contains("2") || num.contains("3") || num.contains("4") || num.contains("6") || num.contains("7") || num.contains("8") || num.contains("9")){
                continue;
            }
            
            list.add(i);
        }
        
        int[] answer ={};
        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
         
        return answer;
    }
}

// 다른사람 풀이
// 이진법 활용하기
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}