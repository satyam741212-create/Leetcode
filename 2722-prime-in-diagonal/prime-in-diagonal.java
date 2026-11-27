class Solution {
    public int diagonalPrime(int[][] nums) {
    int prime=0;
    int n=nums.length;
    for(int i=0;i<nums.length;i++){
     if(isprime(nums[i][i])) prime=Math.max(prime,nums[i][i]);
     if(isprime(nums[i][n-i-1])) prime=Math.max(prime,nums[i][n-i-1]);
    } 
    return prime;
    }
    boolean isprime(int num){
     boolean ans=true;
     if(num<=1){
        ans=false;
     }
     for(int i=2;i*i<=num;i++){
        if(num%i==0){
            ans =false;
            break;
        }
     }
     return ans;
    }
}