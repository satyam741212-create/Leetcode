class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
     int stone=10;
     boolean turn=true;
     while(n >=stone){
        n -=stone;
        stone--;
        turn = !turn;
     }
 return !turn;
    }
}