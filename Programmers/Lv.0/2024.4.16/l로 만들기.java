// 나의 풀이

class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        for(char a : arr){
            if((int)a < 108){
                a = 'l';
            }
            answer += a;
        }
        return answer;
    }
}

// 다른사람 풀이

//정규식 표현 사용
class Solution {
    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
}