// 나의 풀이

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int idx = 0;
        for(int i=0; i<picture.length*k - k + 1; i+=k){
            String[] pixcels = picture[idx].split("");
            for(String pixcel : pixcels){
                if(answer[i] == null){
                    answer[i] = pixcel.repeat(k);
                } else{
                    answer[i] = answer[i] + pixcel.repeat(k);
                }
            }
            for(int j=1; j<k; j++){
                answer[i+j] = answer[i];
            }
            idx++;
        }
        return answer;
    }
}

// 다른사람 풀이
// StringBuilder 사용
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<k; j++) {
                StringBuilder sb = new StringBuilder();

                for(int l=0; l<picture[i].length(); l++) {
                    sb.append(String.valueOf(picture[i].charAt(l)).repeat(k));
                }

                answer[idx++] = sb.toString();
            }
        }

        return answer;
    }
}