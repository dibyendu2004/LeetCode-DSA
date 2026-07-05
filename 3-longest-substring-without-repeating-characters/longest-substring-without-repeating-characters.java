class Solution {
    public int lengthOfLongestSubstring(String s) {
        //-----brute force-----O(n*n)------
        // int n = s.length();
        // int maxLength = 0;
        // for(int i = 0;i < n;i++){
        //     Set<Character> set = new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //         maxLength = Math.max(maxLength,j-i+1);
        //     }
        // }
        // return maxLength;


        //-------better-----kind of O(n*n)--------------
        // int n = s.length();
        // Map<Character,Integer> map = new HashMap<>();
        // int maxLen = 0;
        // int left = 0;
        // for(int right = 0;right<n;right++){
        //     char ch = s.charAt(right);
        //     map.put(ch,map.getOrDefault(ch,0)+1);

        //     while(map.get(ch) > 1){
        //         char leftChar = s.charAt(left);
        //         map.put(leftChar,map.get(leftChar) - 1);
        //         left++;
        //     }
        //     maxLen = Math.max(maxLen,(right-left+1));           
        // }
        // return maxLen;

        //------optimal ------O(n)--------
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for(int right = 0;right<n;right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }

            map.put(ch,right);
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}