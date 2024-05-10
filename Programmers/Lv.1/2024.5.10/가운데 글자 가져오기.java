// 나의 풀이

class Solution {
    public String solution(String s) {
        int len = s.length();

        String answer = "";
        if(len % 2 == 1){
            len /= 2;
            answer = s.substring(len, len + 1);
        } else {
            len /= 2;
            answer = s.substring(len - 1, len + 1);
        }

        return answer;
    }
}

// 다른사람 풀이
class StringExercise{
    String getMiddle(String word){
return word.substring((word.length()-1)/2, word.length()/2 + 1);
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}