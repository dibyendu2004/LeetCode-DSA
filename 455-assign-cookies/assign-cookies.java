class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length,n = s.length;
        int i = 0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i < n && j < m){
            if(g[j] <= s[i]){
                j++;
            }
            i++;
        }
        return j;
    }
}