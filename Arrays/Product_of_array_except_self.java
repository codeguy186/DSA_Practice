class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] preprod=new int[n];
        preprod[0]=1;
        int[] suffprod=new int[n];
        suffprod[n-1]=1;
        for(int i=1;i<n;i++){
            preprod[i]=preprod[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffprod[i]=suffprod[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            preprod[i]=preprod[i]*suffprod[i];
        }
        return preprod;
    }
}