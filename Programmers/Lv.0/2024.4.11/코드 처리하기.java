// 나의 풀이

class Solution {
    public String solution(String code) {
        String[] arr = code.split("");
        int mode = 0;
        String answer = "";
        for(int i=0; i<arr.length; i++){
            if(mode == 0){
                if(arr[i].equals("1")){
                    mode = 1;
                } else {
                    if(i % 2 == 0){
                        answer += arr[i];
                    }
                }
            } else if(mode == 1){
                if(arr[i].equals("1")){
                    mode = 0;
                } else {
                    if(i % 2 == 1){
                        answer += arr[i];
                    }
                }
            }
        }
        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}