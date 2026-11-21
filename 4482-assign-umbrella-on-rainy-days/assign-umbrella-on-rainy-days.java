class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] arr=new String[rain.length];
        int count1=0;
        int count2=0;
        int j=0;
       for(int i=0;i<rain.length;i++){
      if(i<rain.length-1 && rain[i]==1 && rain[i+1]==1){
            if(count1<=count2){
                arr[j++]="Alice";
                count1++;
            }
          else if(count2<count1){
              arr[j++]="Bob";
              count2++;
          }
          else{
              arr[j++]="None";
              count1++;
          }
                   }
           else if(rain[i]==1){
               arr[j++]="Bob";
              count2++;
           }
         else if(i<rain.length-1 && rain[i]==1 && rain[i+1]==0){
          arr[j++]="Bob";
    }
           else{
               arr[j++]="None";
           }
       }
        return arr;
    }
}