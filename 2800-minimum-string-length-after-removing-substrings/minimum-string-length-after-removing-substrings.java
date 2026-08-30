class Solution {
    public int minLength(String s) {
        if(s.length() == 1) return s.length();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            int len = sb.length();

            if(len>0 && ((c == 'B' && sb.charAt(len-1)=='A') || (c == 'D' && sb.charAt(len-1)=='C'))){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(c);
            }
        }

        return sb.length();
    }
}