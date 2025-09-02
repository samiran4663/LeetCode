class Solution {
    public List<String> generateParenthesis(int n) {
        
        ArrayDeque<String> string = new ArrayDeque<>();
        List<String> parenthesis = new ArrayList<>();
        recfunc(0,n,0,parenthesis,string);
        return parenthesis;
    }
    public void recfunc(int fp,int n,int bp,List<String> parenthesis,ArrayDeque<String>string)
    {
        if(fp==n && bp==n)
        {
            parenthesis.add(String.join("",string));
            return;
        }
        if(fp<n)
        {
            string.add("(");
            recfunc(fp+1,n,bp,parenthesis,string);
            string.removeLast();
        }
        if(bp<fp) 
        {
            string.add(")");
            recfunc(fp,n,bp+1,parenthesis,string);
            string.removeLast();
        }
        
        
    }
}