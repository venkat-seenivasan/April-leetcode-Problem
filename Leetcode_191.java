// 191. Number of 1 Bits
//  link -->  https://leetcode.com/problems/number-of-1-bits/

public class Leetcode_191 {
     class Solution {
     public int hammingWeight(int n) {
         int count=0;
         while (n>0){
             if(n%2==0){
                 count=count+0;
             }
             else{
                 count=count+1;
             }
              n=n/2;
         } 
         return count;
     }
 }
}