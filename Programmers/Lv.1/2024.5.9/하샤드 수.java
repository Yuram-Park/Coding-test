// 나의 풀이

class Solution {
    public boolean solution(int x) {
        String xStr = x + "";
        char[] arr = xStr.toCharArray();
        int sum = 0;
        for(char a : arr){
            sum = sum + a -'0';
        }
        
        return x % sum == 0;
    }
}

// 다른사람 풀이
// Stream 이용 String.valueOf():String으로 바꿔줌 / chars() : char형태 array로 바꿔줌

class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
}