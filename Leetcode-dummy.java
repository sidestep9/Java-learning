class Solution {
    public boolean isValid(String s) {
        
        if(s.length() == 0 || s.length() == 1) return false;
        
        char[] stack = new char
        [s.length()];

        int top = 0;

        for(int i = 0; i < s.length(); i++) {
            char o = s.charAt(i);
            
            if(i == s.length() - 1 && (o == '(' || o == '{' || o == '[')) {
                return false;
            }

            if(o == '(' || o == '{' || o == '[') {
                stack[top++] = o;
            }
            else if(o == ')') {
                if(stack[--top] != '(') {
                    return false;
                }
            }
            else if(o == '}') {
                if(stack[--top] != '{') {
                    return false;
                }
            }
            else if(o == ']') {
                if(stack[--top] != '[') {
                    return false;
                }
            }
        }
    }
}