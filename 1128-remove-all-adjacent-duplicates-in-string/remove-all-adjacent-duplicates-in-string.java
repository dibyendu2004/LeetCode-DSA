class Solution {
    public String removeDuplicates(String s) {

    // -------------using stack and space----------
        // Stack<Character> st = new Stack<>();

        // for(char c:s.toCharArray()){
        //     if(!st.isEmpty() && st.peek() == c){
        //             st.pop();
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

        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray()){
            int len = sb.length();

            if(len > 0 && sb.charAt(len-1) == c){
                sb.deleteCharAt(len-1);
            }
            else{
            sb.append(c);
            }
        }
        return sb.toString();
    }
}