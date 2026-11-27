class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
    int[] freq=new int[101];
    for(int n:nums){
        freq[n]++;
    }
    for(int n:freq){
        if(isPrime(n)) return true;
    }
    return false;
    }
    boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}