class Solution {
    public String makeGood(String s) {
        // Stack<Character> st = new Stack<>();

        // for(char c:s.toCharArray()){
        //     if(!st.isEmpty() && (st.peek()-c == 32  || c-st.peek() == 32)){
        //         st.pop();
        //     }
        //     else{
        //         st.push(c);
        //     }
        // }
        // StringBuilder ans = new StringBuilder();
        // while(!st.isEmpty()){
        //     ans.insert(0,st.pop());
        // }
        // return ans.toString();


        StringBuilder st = new StringBuilder();

        for(char c:s.toCharArray()){
            int len = st.length();

            if(len>0 && (st.charAt(len-1)-c == 32  || c-st.charAt(len-1) == 32)){
                st.deleteCharAt(len-1);
            }
            else{
                st.append(c);
            }
        }
        return st.toString();
    }
}