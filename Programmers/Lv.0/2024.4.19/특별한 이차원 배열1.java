// 나의 풀이

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    answer[i][j] = 1;
                } else{
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}

// 다른사람 풀이

    // int 배열은 값을 지정 안하면 0으로 들어간다. String은 null 로 들어간다.
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}