// 나의 풀이

class Solution {
    public int[][] solution(int[][] arr) {
        
        int h = arr.length;
        int y = arr[0].length;
        int[][] answer = {};
        
        if(h > y){
            answer = new int[h][h];
            for(int i=0; i<h; i++){
                System.arraycopy(arr[i], 0, answer[i], 0, y);
            }
        } else if(h < y){
            answer = new int[y][y];
            for(int i=0; i<h; i++){
                System.arraycopy(arr[i], 0, answer[i], 0, y);
            }
        } else {
            answer = arr;
        }
        
        return answer;
    }
}

// 다른사람 풀이
// 한번에 넣음.

class Solution {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
        }
        return array;
    }
}