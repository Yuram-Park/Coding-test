// 나의 풀이
class Solution {
    public int solution(String myString, String pat) {
        String[] myArr = myString.split("");
        myString = "";
        for(String a : myArr){
            if(a.equals("A")){
                a = "B";
            } else{
                a = "A";
            }
            myString += a;
        }
        int answer = 0;
        if(myString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}


// 다른사람의 풀이

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}