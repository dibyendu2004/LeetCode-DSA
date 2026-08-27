class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
    StringBuilder str1 = new StringBuilder();
        while(!st.isEmpty()){
            str1.insert(0,st.pop());
        }

         for(char c:t.toCharArray()){
            if(c == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
    StringBuilder str2 = new StringBuilder();
        while(!st.isEmpty()){
            str2.insert(0,st.pop());
        }
    if(str1.toString().equals(str2.toString())) return true;
        return false;

    }
}