class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i) == '#'){
                st.pop();
            }
            else if(s.charAt(i) != '#'){
                st.push(s.charAt(i));
            }
        }
    StringBuilder str1 = new StringBuilder();
        while(!st.isEmpty()){
            str1.insert(0,st.pop());
        }

        for(int i=0;i<t.length();i++){
            if(!st.isEmpty() && t.charAt(i) == '#'){
                st.pop();
            }
            else if(t.charAt(i) != '#'){
                st.push(t.charAt(i));
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