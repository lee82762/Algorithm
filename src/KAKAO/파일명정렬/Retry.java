package KAKAO.파일명정렬;

import java.util.*;
import java.util.Comparator;
class Retry {
    public String[] solution(String[] files) {
        int len = files.length;
        String[][] filesInfo = new String[len][3];

        for(int i = 0; i < len; i++){
            StringBuilder sb = new StringBuilder();
            int numI = 0;
            int tmpLen = files[i].length();
            for(int j = 0; j < tmpLen; j++){
                char c = files[i].charAt(j);

                if('0' <= c && c <= '9'){
                    while(('0' <= c && c <= '9') && j < tmpLen){
                        sb.append(c);
                        j++;
                        numI = j;
                        if(j < tmpLen)
                            c = files[i].charAt(j);
                        else
                            break;
                    }
                    break;
                }
            }
            int headI = numI - sb.length();
            filesInfo[i][0] = files[i].substring(0,headI);
            filesInfo[i][1] = files[i].substring(headI,numI);
            filesInfo[i][2] = files[i].substring(numI,tmpLen);
        }
        Arrays.sort(filesInfo, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].toLowerCase().equals(o2[0].toLowerCase())){
                    int a=Integer.parseInt(o1[1]);
                    int b=Integer.parseInt(o2[1]);
                    return Integer.compare(a,b);
                }
                else{
                    return o1[0].toLowerCase().compareTo(o2[0].toLowerCase());
                }
            }
        });
        String answer[]=new String[filesInfo.length];
        for(int i=0; i<filesInfo.length; i++){
            answer[i]=(filesInfo[i][0]+filesInfo[i][1]+filesInfo[i][2]);
        }
        return answer;

    }
}
