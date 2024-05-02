// 나의 풀이

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] strs = my_string.toCharArray();
        for(char str : strs){
            int num = (int) str;
            if(num < 97){
                answer[num-65]++;
            } else{
                answer[num-71]++;
            }
        }
        return answer;
    }
}

// 다른사람 풀이
// 문자를 바로 빼고, 추가로 더 빼줌

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(char ch: my_string.toCharArray()) {
            answer[ch - 'A' - (Character.isLowerCase(ch)?6:0)]++;
        }
        return answer;
    }
}