class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
     return gcd(min,max);
    }
   int gcd(int min,int max){
    int ans=0;
    for(int i=1;i<=max;i++){
        if(min%i==0 && max%i==0){
            ans=i;
        }
    }
    return ans;
   } 
}