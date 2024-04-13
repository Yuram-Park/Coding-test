// 나의 풀이

class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        String[] arr = n_str.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("0")){
                answer = n_str.substring(i+1);
            } else{
                break;
            }
        }
        return answer;
    }
}

// 다른사람 풀이

class Solution {
    public String solution(String n_str) {
        return ""+Integer.parseInt(n_str);
    }
}