class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new ArrayList<>();
        int m = s.length(),n = p.length();
        
        int pCount[] = new int[26];
        for(char c : p.toCharArray()){
            pCount[c - 'a']++;
        }

        for(int i=0;i<=m-n;i++){
            int sCount[] = new int[26];
            for(int j=i;j<i+n;j++){
                sCount[s.charAt(j) - 'a']++;
            }

            if(Arrays.equals(pCount,sCount)){
                lst.add(i);
            }
        }
        return lst;
    }
}