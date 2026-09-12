class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            // if(c == 'a' || c='e' || c=='i' || c=='o' || c=='u'){
            //     vowel++;
            // }
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxV = 0;
        int maxC = 0;
        for(char c:map.keySet()){
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
                maxV = Math.max(maxV,map.get(c));
            }
            else{
                maxC = Math.max(maxC,map.get(c));
            }
        }
        return maxV+maxC;
    }
}