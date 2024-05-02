// 나의 풀이

import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] arr1 = arr.clone();
        
        do{
            for(int i=0; i<arr.length; i++){
                arr1[i] = arr[i];
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            answer++;
        } while(!Arrays.equals(arr, arr1));
        
        return answer;
    }
}

// 다른사람 풀이
// 각 원소 하나씩 먼저 끝까지 변환 시키면서 카운트, 카운트 최대값 return
import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        return Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
    }

    private int cntAction(int n) {

        int cnt = 0;
        boolean flag = true;

        while (flag) {

            if (n % 2 == 0 && 50 <= n) {
                n /= 2;
                cnt++;
            } else if (n % 2 == 1 && n < 50) {
                n *= 2;
                n += 1;
                cnt++;
            } else {
                flag = false;
            }
        }
        return cnt;
    }
}