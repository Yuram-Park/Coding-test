// 나의 풀이

class Solution {
    public long solution(long n) {
        long answer = -1;
        double x = Math.sqrt(n);
        if(Math.floor(x) == x){
            answer = (long)Math.pow(x+1,2);
        }
        return answer;
    }
}

// 다른사람 풀이
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}