// 나의 풀이

import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= (start+end)/2; j++) {
                char temp = arr[j];
                arr[j] = arr[start+end-j];
                arr[start+end-j] = temp;
            }
        }
        return new String(arr);
    }
}

// 다른사람 풀이

class Solution {

    char[] arr;

    public String solution(String my_string, int[][] queries) {

        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }

        return new String(arr);
    }

    private void reverse(int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}