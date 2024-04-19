// 나의 풀이

import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> stkList = new ArrayList<>();
        while(i < arr.length){
            if(stkList.size() == 0){
                stkList.add(arr[i]);
                i++;
            } else if(stkList.get(stkList.size() - 1) < arr[i]){
                stkList.add(arr[i]);
                i++;
            } else if(stkList.get(stkList.size() - 1) >= arr[i]){
                stkList.remove(stkList.size() - 1);
            }
        }
        int[] stk = new int[stkList.size()];
        for(int j=0; j<stk.length; j++){
            stk[j] = stkList.get(j);
        }
        return stk;
    }
}

// 다른사람 풀이

    //stack 이용 
import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack;
    }
}