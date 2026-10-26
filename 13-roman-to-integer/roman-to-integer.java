class Solution {
    public int romanToInt(String s) {
        int a=0;
        int n=s.length();
        for(int i=0;i<n;i++){
      if(s.charAt(i)=='M'){
        a +=1000;
      }
      //i++ isliye kr rhe hai jb dono mil jayenge to hume i ko increase krne h
      // taki value dubara count na ho
    else if(i+1<n && s.charAt(i)=='C' && s.charAt(i+1)=='M'){
        a +=900;
        i++;
    }
    else if(i+1<n && s.charAt(i)=='C' && s.charAt(i+1)=='D'){
        a +=400;
        i++;
    }
    else if(s.charAt(i)=='C'){
        a +=100;
    }
    else if(s.charAt(i)=='D'){
        a +=500;
    }
    else if(i+1<n && s.charAt(i)=='X' && s.charAt(i+1)=='C'){
        a +=90;
        i++;
    }
    else if(i+1<n && s.charAt(i)=='X' && s.charAt(i+1)=='L'){
        a +=40;
        i++;
    }
    else if(s.charAt(i)=='X'){
        a +=10;
    }
    else if(s.charAt(i)=='L'){
        a +=50;
    }
    else if(s.charAt(i)=='V'){
        a +=5;
    }
    else if(i+1<n && s.charAt(i)=='I' && s.charAt(i+1)=='X'){
        a +=9;
        i++;
    }
 else if(i+1<n && s.charAt(i)=='I' && s.charAt(i+1)=='V'){
        a +=4;
        i++;
    }
    else{
        a +=1;
    }
        }
        return a;
    }
}
