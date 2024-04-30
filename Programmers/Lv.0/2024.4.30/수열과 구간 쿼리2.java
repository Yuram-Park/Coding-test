// 나의 풀이

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = 1000001;
            for(int j=s; j<=e; j++){
                if(k < arr[j] && arr[j] < min){
                    min = arr[j];
                }
            }
            
            if(min != 1000001){
                answer[i] = min;
            }
        }
        return answer;
    }
}

// 다른사람 풀이

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        return IntStream.range(0, queries.length)
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
                        .map(i -> arr[i])
                        .filter(i -> i > queries[q][2])
                        .min().orElse(-1)
                ).toArray();
    }
}
