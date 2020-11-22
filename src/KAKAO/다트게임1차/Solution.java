package KAKAO.다트게임1차;

class Solution {
    public int solution(String dartResult) {

        int cnt=0;
        int[] arr = new int[3];

        String tempNum ="";
        for(char c:dartResult.toCharArray()){
            if(Character.isDigit(c)){
                tempNum+=c;
            }
            else{
                if(!"".equals(tempNum)){
                    arr[cnt++]=Integer.parseInt(tempNum);
                    tempNum="";
                }
                switch(c){
                    case 'S':

                        arr[cnt - 1] =(int) (arr[cnt - 1] ) * 1;
                        break;
                    case'D':
                        arr[cnt - 1] = (int)(arr[cnt - 1] ) * (arr[cnt - 1] );

                        break;
                    case'T':
                        arr[cnt - 1] = (int)(arr[cnt - 1]) * (arr[cnt - 1])*(arr[cnt - 1] );
                        break;
                    case'*':
                        arr[cnt-1]=(int) (arr[cnt-1])*2;
                        if(cnt-2>=0){
                            arr[cnt-2]=(int) (arr[cnt-2])*2;
                        }
                        break;
                    case'#':
                        arr[cnt-1]=(int) (arr[cnt-1])*-1;
                        break;

                }
            }



        }

        int sum=0;
        sum=arr[0]+arr[1]+arr[2];
        return sum;
    }




}
