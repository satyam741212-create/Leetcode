class Solution {
    public int myAtoi(String s) {
    if(s.length()==0 || s==null){
        return 0;
    }
    int intmax=Integer.MAX_VALUE;
    int intmin=Integer.MIN_VALUE;
    int i=0;
    int n=s.length();
    while(i<n && s.charAt(i)==' '){
        i++;
    }
    if(i==n){
        return 0;
    }
    int sign=1;
    if(s.charAt(i)=='+'){
        sign =1;
        i++;
    }else if(s.charAt(i)=='-'){
        sign = -1;
        i++;
    }
    long res=0;
    while(i<n && Character.isDigit(s.charAt(i))){
        int digit=s.charAt(i)-'0';
        res = res*10+digit;
        if(sign*res<=intmin){
            return intmin;
        }
        if(sign*res>=intmax){
            return intmax;
        }
        i++;
    }
    return (int) (res*sign);
    }
}