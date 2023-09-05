class Solution
{
    public void helper(Stack<Integer> st,int k){
        if(k==1){
            st.pop();
            return;
        }
        int temp=st.pop();
        helper(st,k-1);
        st.push(temp);
        
    }
    public void deleteMid(Stack<Integer> s,int sizeOfStack){
        int k=(int)Math.floor((sizeOfStack)/2)+1;
        helper(s,k);
    } 
}
