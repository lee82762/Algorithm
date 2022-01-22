package 리틀코드.selfdividingnumbers;

import java.util.*;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans=new ArrayList<>();
        for(int i=left; i<=right; i++){
            int tm=i;
            boolean check=true;
            if(tm%10==0) continue;
            while (tm!=0){
                int a=tm%10;
                if(a==0) {
                    check=false;
                    break;
                }
                if(i%a!=0){
                    check=false;
                    break;
                }
                tm/=10;
            }

            if(check==true){
                ans.add(i);
            }
        }
        return ans;

    }
}
