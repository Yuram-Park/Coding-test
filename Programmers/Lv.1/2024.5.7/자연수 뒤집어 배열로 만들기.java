// 나의 풀이
// long to int는 (int)만 해줘도 된다.

class Solution {
    public int[] solution(long n) {
        String nStr = n + "";
        int len = nStr.length();
        int[] answer = new int[len];
        
        int idx = 0;
        for(int i=0; i<len; i++){
            long s = n % 10;
            answer[i] = Long.valueOf(s).intValue();
            n = n / 10;
        }
        return answer;
    }
}

// 다른사람 풀이
// stream의 StringBuilder 사용
// StringBuilder.chars(), Character.getNumericValue() 
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}