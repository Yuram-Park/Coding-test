// 나의 풀이

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] a : queries){
            int temp = arr[a[0]];
            arr[a[0]] = arr[a[1]];
            arr[a[1]] = temp;
        }
        return arr;
    }
}