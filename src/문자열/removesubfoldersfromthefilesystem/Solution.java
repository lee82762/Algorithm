package 문자열.removesubfoldersfromthefilesystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder,(o1, o2)->o1.length()-o2.length());
        HashSet<String> set=new HashSet<>();

        for(String s:folder){
            boolean check=true;
            for(int i=2; i<s.length(); i++){
                if(s.charAt(i)=='/'&&set.contains(s.substring(0,i))){
                    check=false;
                    break;
                }
            }
            if(check==true){
                set.add(s);
            }
        }
        return new ArrayList<>(set);
    }
}
