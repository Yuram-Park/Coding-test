// 나의 풀이

class Solution {
    public String solution(int q, int r, String code) {
        String[] codeArr = code.split("");
        String answer = "";
        for(int i=0; i<codeArr.length; i++){
            if(i % q == r){
                answer += codeArr[i];
            }
        }
        return answer;
    }
}

// 다른사람 풀이

class Solution {
    public String solution(int q, int r, String code) {

        StringBuilder sb = new StringBuilder();

        for (int i = r; i < code.length(); i += q)
            sb.append(code.charAt(i));

        return sb.toString();
    }
}