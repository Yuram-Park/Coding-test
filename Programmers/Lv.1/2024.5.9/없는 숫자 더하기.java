// 나의 풀이

import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            list.add(numbers[i]);
        }

        int answer = 0;
        for(int i=0; i<10; i++){
            if(list.indexOf(i) == -1){
                answer += i;
            }
        }
        return answer;
    }
}

// 다른사람 풀이1
// 합에서 빼기

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}

// 다른사람 풀이2
// indexOf() 이용 안하고

import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] sum = {0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i< sum.length; i++){
            for(int j=0; j< numbers.length; j++){
                if(sum[i] == numbers[j]){
                    sum[i] -= numbers[j];
                }
            }
            answer += sum[i];
        }
        return answer;
    }
}