// 나의 풀이

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            String temp = myString.substring(i,i+pat.length());
            if(temp.equals(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}

// 다른사람 풀이
// startsWith()

class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        return cnt;
    }
}