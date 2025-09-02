class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> string = new ArrayList<>();
        List<String> parenthesis = new ArrayList<>();
        recfunc(0,n,0,parenthesis,string);
        return parenthesis;
    }
    public void recfunc(int fp,int n,int bp,List<String> parenthesis,List<String>string)
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
            string.remove(string.size()-1);
        }
        if(bp<fp) 
        {
            string.add(")");
            recfunc(fp,n,bp+1,parenthesis,string);
            string.remove(string.size()-1);
            
        }
       
        
    }
}