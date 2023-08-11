class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }
            else{
                hm.put(i,hm.get(i)+1);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
        for(int key:hm.keySet()){
            pq.add(key);
        }
        int j=0;
        while(j<k){
            res[j]=pq.poll();
            j++;
        }
        return res;
    }
}