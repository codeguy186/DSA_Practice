class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(c=='{'){
                st.push('}');
            }
            else{
                if(st.empty() || st.pop()!=c){//closing bracket but stack is empty or closing bracket does not match last opening bracket
                    return false;
                }
            }
        }
        return st.empty();//leftover unchecked closing brackets are left or not
    }
}