// 나의 풀이

class Solution {
    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int answer = 0;
        
        for(char a : arr){
            if(48 < a && a < 58){
                answer = answer + a - 48;
            }
        }
        
        return answer;
    }
}

// 다른사람 풀이
// 아스키 코드 - '0' 하면 숫자로 자동 계산된다
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for(char c : my_string.toCharArray()){
            if(c >= '0' && c <= '9'){
                answer += c - '0';
            }
        }
        return answer;
    }
}