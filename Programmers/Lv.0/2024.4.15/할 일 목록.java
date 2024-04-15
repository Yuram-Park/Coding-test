// 나의 풀이

import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}


// 다른 사람의 풀이

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str = "";
        for(int i=0; i<finished.length; i++){
            str = finished[i]==false ? str+todo_list[i]+"," : str;
        }

        return str.split(",");
    }
}