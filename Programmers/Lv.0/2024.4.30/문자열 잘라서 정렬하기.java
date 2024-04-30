// 나의 풀이

import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        System.out.println(arr[1]);
        for(String a : arr){
            if(a.equals("") || a.equals(" ")){
                continue;
            }
            list.add(a);
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}