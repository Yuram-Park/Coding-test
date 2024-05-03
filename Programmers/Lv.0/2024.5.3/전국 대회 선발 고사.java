// 나의 풀이

import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                list.add(rank[i]*100 + i);
            }
        }
        
        Collections.sort(list);
        
        int a = list.get(0) % 100;
        int b = list.get(1) % 100;
        int c = list.get(2) % 100;
    
        int answer = 10000 * a + 100 * b + c;
        return answer;
    }
}

// 다른사람 풀이
// stream() 사용
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3L)
                .reduce((current, next) -> current * 100 + next)
                .get();
    }
}