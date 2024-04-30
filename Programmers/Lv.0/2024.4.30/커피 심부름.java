// 나의 풀이

class Solution {
    public int solution(String[] order) {
        int[] orderList = new int[2];
        
        for(String list : order){
            if(list.contains("americano") || list.equals("anything")){
                orderList[0]++;
            } else {
                orderList[1]++;
            }
        }
        int answer = orderList[0]*4500 + orderList[1]*5000;
        return answer;
    }
}