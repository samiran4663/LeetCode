class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']')return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty())
            {
                if((stack.peek()=='(' && s.charAt(i)!=')')||(stack.peek()=='{' && s.charAt(i)!='}')
                || (stack.peek()=='[' && s.charAt(i)!=']'))
                {
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else if(stack.isEmpty())
            {
                return false;
            }
        }
        
        return stack.isEmpty()?true:false;
    }
}