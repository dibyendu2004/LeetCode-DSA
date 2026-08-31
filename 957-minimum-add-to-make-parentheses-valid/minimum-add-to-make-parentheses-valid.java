class Solution {
    public int minAddToMakeValid(String s) {
        // int cnt1 = 0,cnt2 = 0;

        // for(char c:s.toCharArray()){
        //     if(c == '(') cnt1++;
        //     if(c == ')') cnt2++;
        // }

        // int max = Math.max(cnt1,cnt2);
        // int min = Math.min(cnt1,cnt2);
        // return max-min;

        Stack<Character> st = new Stack<>();

        for(char c:s.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
        return st.size();
    }
}