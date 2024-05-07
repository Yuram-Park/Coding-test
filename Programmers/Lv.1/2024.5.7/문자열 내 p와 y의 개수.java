// 나의 풀이

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toLowerCase().toCharArray();
        
        int pNum = 0;
        int yNum = 0;
        for(char c : str){
            if(c == 'p'){
                pNum++;
            } else if( c == 'y'){
                yNum++;
            }
        }
        
        if(pNum != yNum){
            answer = false;
        }
        return answer;
    }
}

// 다른사람 풀이
// 변수를 한가지로 설정함.
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}