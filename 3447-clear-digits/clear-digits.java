class Solution {
    public String clearDigits(String s) {
        StringBuilder st=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
           if(st.length()>0){
            st.deleteCharAt(st.length()-1);
           }
        }
        else{
            st.append(s.charAt(i));
        }
       }
       return st.toString();
    }
}