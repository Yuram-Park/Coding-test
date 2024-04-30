// 나의 풀이

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i=0; i<3; i++){
            if(date1[i] > date2[i]){
                return 0;
            } else if( date1[i] < date2[i]){
                return 1;
            }
        }
        
        return answer;
    }
}

// 다른사람 풀이

class Solution {
    public int solution(int[] date1, int[] date2) {
        int date1Days = getTotalDays(date1);
        int date2Days = getTotalDays(date2);
        return date1Days < date2Days ? 1 : 0;
    }

    public int getTotalDays(int[] date) {
        int result = 0;
        result += date[0] * 360;
        result += date[1] * 30;
        result += date[2];
        return result;
    }
}
