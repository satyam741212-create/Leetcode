class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] flag =new boolean[nums.length+1];
        int dup=0;
        int missing=0;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(flag[ele]==true){
               dup=ele;
            }
            else{
                flag[ele]=true;
            }
        }
         for (int i = 1; i <= nums.length; i++) {
            if (flag[i] == false) {
                missing = i;
                break;
            }
        }
        return new int[]{dup,missing};
    }
}