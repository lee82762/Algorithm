package 리틀코드.ReverseSubstringsBetweenEachPairofParentheses;

import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        if(s.isEmpty()) return s;

        StringBuilder sb=new StringBuilder();

        Stack<Character> stack=new Stack<>();

        char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i++) {
            if(stack.isEmpty() && ch[i]!='(') {
                sb.append(ch[i]);
            } else if(ch[i]=='(') {
                stack.push(ch[i]);
            } else if(!stack.isEmpty() && ch[i]!=')') {
                stack.push(ch[i]);
            } else if(!stack.isEmpty() && ch[i]==')') {
                String str="";
                while(stack.peek()!='(') {
                    str+=stack.pop();
                }
                stack.pop();
                for(char t:str.toCharArray()) {
                    stack.push(t);
                }
            }
        }
        for(char c:stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
