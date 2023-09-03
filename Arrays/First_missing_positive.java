class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int pos=nums[i]-1;
            if(nums[i]>n || nums[i]<=0 || nums[pos]==nums[i]){
                i++;
            }
            else{
                swap(nums,i,pos);
            }
            
        }
        for(int j=0;j<n;j++){
            if((j+1)!=nums[j]){
                return j+1;
            }
        }
        return n+1;
    }
    public void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}