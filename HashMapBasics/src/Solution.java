import java.util.HashMap;
import java.util.Map;
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set = new HashSet<>();
        int a1 = 0;
        for(int a: A){
            if(set.contains(a*-1))
            a1 = Math.max(a1,Math.abs(a));
            else
            set.add(a);
        }
        return a1;
    }
}
class Solution1 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
           int count1 = 0;
           int count2 = 0;
        
        for(int i=0; i<A.length; i++){
            if(i % 2 == 0){
                if(A[i] == 1){
                    count1 += 1;
                }
                if(A[i] == 0){
                    count2 += 1;
                }
            }
            else {
                if(A[i] == 0){
                    count1 += 1;
                }
                if(A[i] == 1){
                    count2 += 1;
                }
            }
        }
       if(count1<count2){
           return count1;
       }else{
           return count2;
       }
    }
}
