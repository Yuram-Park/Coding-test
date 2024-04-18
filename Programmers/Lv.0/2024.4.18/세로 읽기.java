// 나의 풀이

class Solution {
    public String solution(String my_string, int m, int c) {
        String[] arr = my_string.split("");
        String[][] arr2 = new String[arr.length / m][m];
        int idx = 0;
        for(int i=0; i<arr.length/m; i++){
            for(int j=0; j<m; j++){
                arr2[i][j]= arr[idx];
                idx++;
            }
        }
        String answer = "";
        for(int i=0; i<arr2.length; i++){
            answer += arr2[i][c-1];
        }
        return answer;
    }
}

// 다른사람 풀이

class Solution {

    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}