// 나의 풀이

class Solution {
    public long solution(int price, int money, int count) {
        
        long sum = 0;
        for(int i=1; i<=count; i++){
            sum = sum + price * i;
        }
        if(money >= sum) return 0;
        long answer = sum - money;
        return answer;
    }
}

// 다른사람 풀이
// 등차수열의 합을 이용 / Math.max(num1, num2)
class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}