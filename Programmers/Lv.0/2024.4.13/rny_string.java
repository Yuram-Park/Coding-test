// 나의 풀이

class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] arr = rny_string.split("");
        for(String a : arr){
            if(a.equals("m")){
                a = "rn";
            }
            answer += a;
        }
        return answer;
    }
}

// 다른사람 풀이

class Solution {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}