class Solution {
    public char kthCharacter(int k) {
        StringBuilder word= new StringBuilder("a");
        func(word,k);
        return word.charAt(k-1);
    }
    public void func(StringBuilder word,int k)
    {
        if(word.length()>=k)
        {
            return;
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            s.append((char)((int)word.charAt(i)+1));
        }
        word.append(s);
        func(word,k);
    }
}