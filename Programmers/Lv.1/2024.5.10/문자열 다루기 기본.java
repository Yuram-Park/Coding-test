// 나의 풀이

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length();
        if(len == 4 || len == 6){
            answer = true;
            for(int i=0; i<len; i++){
                char c = s.charAt(i);
                if(c < 48 || c > 57) answer = false;
            }
        }
        return answer;
    }
}

// 다른사람 풀이 1
// error(try-catch) 이용
class Solution {
  public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
  }
}

// 다른사람 풀이 2
// 정규식 이용

class Solution {
  public boolean solution(String s) {
    return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
  }
}

