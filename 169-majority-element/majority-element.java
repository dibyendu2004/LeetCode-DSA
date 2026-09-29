class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxfreq=0;
        int maxval=0;
        for(int i:map.keySet()){
            if(map.get(i)>maxfreq){
                maxfreq = map.get(i);
                maxval = i;
            }
        }
        return maxval;
    }
}