// 나의 풀이

class Solution {
    public String solution(String myString, String pat) {
        int idx = 0;
        
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            if(myString.substring(i).startsWith(pat)){
                idx = i;
            }
        }
        
        return myString.substring(0, idx + pat.length());
    }
}

// 다른사람 풀이
// lastIndexOf(문자열);
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        int idx = myString.lastIndexOf(pat);

        answer = myString.substring(0, idx) + pat;

        return answer;
    }
}