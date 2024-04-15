// 나의 풀이

class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        for(String a : arr){
            answer += Integer.parseInt(a);
        }
        return answer % 9;
    }
}

// 다른사람 풀이

class Solution {
    public int solution(String number) {
        int answer = 0;

        for(int i=0; i<number.length(); i++) {
            answer += number.charAt(i) - '0';
        }

        answer %= 9;

        return answer;
    }
}