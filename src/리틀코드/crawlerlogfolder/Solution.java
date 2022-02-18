package 리틀코드.crawlerlogfolder;

import java.util.Stack;

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(int i=0; i< logs.length; i++){
            String tm = logs[i];
            if(tm.equals("../")){
                if(st.isEmpty()) continue;
                st.pop();
            }
            else if(tm.equals("./")){
                continue;
            }
            else{
                st.add(tm);
            }
        }
        return st.size();

    }
}
