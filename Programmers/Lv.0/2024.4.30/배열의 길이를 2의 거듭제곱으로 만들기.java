// 나의 풀이

class Solution {
    public int[] solution(int[] arr) {
        int length = 1;
        for(int i=0; i<10; i++){
            if(length >= arr.length){
                break;
            }
            length *= 2;
        }
        int[] answer = new int[length];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}

// 다른사람 풀이
// Arrays.copyOf(배열, 길이)
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}