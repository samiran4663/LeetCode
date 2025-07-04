class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String str[]=s.split("\\s+");
        String last="";
        for(String sh:str){
            last=sh;
        }
        int length=last.length();
        return length;
    }
}