// 나의 풀이(실패 -> 어떤 케이스에서 실패했는지 모르겠다)
import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        String arrStr = "" + arr[0] + arr[1] + arr[2] + arr[3];
        
        int[] newArr = Arrays.stream(arr).distinct().toArray();
        int len = newArr.length;
        int answer = 0;
        
        if(len == 1){
            answer = 1111 * newArr[0];
        } else if(len == 4){
            answer = newArr[0];
        } else if(len == 3){
            int p = 0;
            for(int i=0; i<4; i++){
                if(i != arrStr.lastIndexOf(arr[i])){
                    p = i;
                    break;
                }
            }
            answer = newArr[0] * newArr[1] * newArr[2] / arr[p];  
        } else if(len == 2){
            if(arr[1] != arr[2]){
                answer = (newArr[0] + newArr[1]) * (newArr[0] - newArr[1]);
                if(answer < 0) answer *= -1;
            } else {
                if(arr[0] == arr[2]){
                    answer = (10 * newArr[0] + newArr[1]) * (10 * newArr[0] + newArr[1]);
                } else if(arr[1] == arr[3]){
                    answer = (10 * newArr[1] + newArr[0]) * (10 * newArr[1] + newArr[0]);
                }
            }
        }
        
        return answer;
    }
}


// 다른 사람 풀이
// Math.pow()
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}