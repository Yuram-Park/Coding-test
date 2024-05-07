// 나의 풀이

import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            
            for(int j=0; j<name.length; j++){
                if(Arrays.asList(photo[i]).indexOf(name[j]) != -1){
                    sum += yearning[j];
                }
            }
            answer[i] = sum;
            }
        return answer;
        }
    }


// 다른사람 풀이
// map(key, value)로 넣어서 맞추기

import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0; i< name.length; i++){
            map.put(name[i],yearning[i]);
        }

        for(int i =0; i< photo.length;i++){
            String[] persons = photo[i];
            int score = 0;
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){
                    score+=map.get(person);
                }
            }
            answer[i]=score;
        }

        return answer;


    }
}