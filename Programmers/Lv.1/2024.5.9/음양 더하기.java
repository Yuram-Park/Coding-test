// 나의 풀이

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = absolutes.length;
        for(int i=0; i<len; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}

// 다른사람 풀이
// 삼항식 이용

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}