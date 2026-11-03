class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
                while(nums[i]<max){
                    nums[i]++;
                   count++;    
                }
        }
        return count;
    }
}