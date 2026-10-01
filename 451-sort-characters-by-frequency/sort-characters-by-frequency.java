class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> ls = new ArrayList<>(map.keySet());
        Collections.sort(ls,(a,b)->map.get(b)-map.get(a));

        StringBuilder ans = new StringBuilder();
        for(char c:ls){
            int count=map.get(c);
            for(int i=0;i<count;i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}