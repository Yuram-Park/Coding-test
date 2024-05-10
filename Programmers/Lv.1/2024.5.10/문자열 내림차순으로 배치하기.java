// 나의 풀이

import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        String answer = "";
        for(int i=arr.length-1; i>=0; i--){
            answer += arr[i];
        }
        return answer;
    }
}

// 다른사람 풀이
// StringBuilder.reverse()

import java.util.Arrays;

public class ReverseStr {
    public String reverseStr(String str){
        char[] sol = str.toCharArray();
    Arrays.sort(sol);
    return new StringBuilder(new String(sol)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}