class Solution {
    public int heightChecker(int[] heights) {
        int[] ht=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            ht[i]=heights[i];
        }
        Arrays.sort(ht);
        int idx=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] !=ht[i]){
                idx++;
            }
        }
        return idx;
    }
}