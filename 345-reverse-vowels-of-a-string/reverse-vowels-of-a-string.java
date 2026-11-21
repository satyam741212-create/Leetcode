class Solution {
    public String reverseVowels(String s) {
    char[] word=s.toCharArray();
    int i=0;
    int j=s.length()-1;
    while(i<j){
        while(i<j && !vowels(word[i])){
            i++;
        }
        while(i<j && !vowels(word[j])){
            j--;
        }
        char temp=word[i];
        word[i]=word[j];
        word[j]=temp;
        i++;
        j--;
    }
    String answer =new String(word);
    return answer;
    }
    public boolean vowels(char s){
        return s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'
                || s=='I'|| s=='O'||s=='U';
    }
}