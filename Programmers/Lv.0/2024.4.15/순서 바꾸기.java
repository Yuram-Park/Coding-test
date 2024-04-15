// 나의 풀이

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length-n; i++){
            answer[i] = num_list[i+n];
        }
        for(int i=num_list.length-n; i<num_list.length; i++){
            answer[i] = num_list[i+n-num_list.length];
        }
        return answer;
    }
}

// 다른사람 풀이

class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length];
        for (int i = n;i < num_list.length;i++)
            answer[idx++] = num_list[i];
        for (int i = 0;i < n;i++)
            answer[idx++] = num_list[i];
        return answer;
    }
}