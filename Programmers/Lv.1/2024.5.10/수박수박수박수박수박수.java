// 나의 풀이

class Solution {
    public String solution(int n) {
        String[] sb = {"수", "박"};
        String answer = "";

        for(int i=0; i<n; i++){
            answer += sb[i % 2];
        }
        return answer;
    }
}

// 다른사람 풀이
// char 로 절반 선언 후 수박으로 replace
public class WaterMelon {
    public String watermelon(int n){

        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}