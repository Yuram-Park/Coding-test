// 나의 풀이

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        while(i<arr.length){
            if(stk.size() == 0){
                stk.add(arr[i]);
                i++;
            } else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        int[] answer = {};
        
        if(stk.size() != 0){
            answer = new int[stk.size()];
            for(int j=0; j<stk.size(); j++){
                answer[j] = stk.get(j);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}

// 다른사람 풀이

import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.peek()) {
                stack.pop();
            } else {
                stack.push(no);
            }
        }

        return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
    }
}