// 나의 풀이(실패)

import java.util.*;
class Solution {
    public String solution(String a, String b) {
        int aL = a.length();
        int bL = b.length();
        
        if(aL < bL){
            String temp = a;
            a = b;
            b = temp;
            
            int tempInt = aL;
            aL = bL;
            bL = tempInt;
        }
        
        String[] arr = a.split("");
        String[] brr = b.split("");
        
        int[] aArr = new int[aL];
        int[] bArr = new int[bL];
        
        for(int i=0; i<aL; i++){
            aArr[i] = Integer.parseInt(arr[aL-1-i]);
        }
        for(int i=0; i<bL; i++){
            bArr[i] = Integer.parseInt(brr[bL-1-i]);
        }
        
        int add = 0;
        
        for(int i=0; i<bL; i++){
            
            int num = aArr[i] + bArr[i];

            if(num >= 10){
                int ten = num / 10;
                num = num % 10;
                aArr[i] = num;
                if(aL-1 > i){
                    aArr[i+1] = aArr[i+1] + ten;
                } else{
                    add = ten;
                }
            } else{
                aArr[i] = num;
            }
        }
        
        String answer = "";
        if(add != 0){
            answer = add + "";
        }
        for(int i=aL - 1; i>=0; i--){
            answer += aArr[i];
        }
        return answer;
    }
}


// 다른사람 풀이
import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        BigInteger sum = numA.add(numB);
        
        return sum.toString();
    }
}