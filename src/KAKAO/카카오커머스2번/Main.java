package KAKAO.카카오커머스2번;



import java.util.ArrayList;

public class Main {
    static ArrayList<String>s1=new ArrayList<>();
    public static void main(String arg[]){
        int[][] needs={ { 1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        int r=2;


        int re[]=new int[needs[0].length];
        boolean visit[]=new boolean[needs[0].length];
        for(int i=0; i<re.length; i++){
            re[i]=i;
        }
        com1(re,visit,0,r);
        int max=0;

        for(int i=0; i<s1.size(); i++){
            String s=s1.get(i);

            String []s2=s.split("");
            int []a3=new int[s2.length];
            for(int j=0; j<a3.length; j++){
                a3[j]=Integer.parseInt(s2[j]);
            }

            int cnt=0;
            int cnt1=0;


            for(int j=0; j<needs.length; j++){
                cnt=0;
                for(int k=0; k<needs[j].length; k++){
                    boolean visit1=false;


                    if(needs[j][k]==1 ){
                        for(int h=0; h<a3.length; h++){
                            if(k==a3[h]){
                                visit1=true;
                                break;
                            }
                        }
                        if(visit1==false){
                            cnt--;
                        }
                        else{
                            cnt++;
                        }
                    }


                }



                // System.out.println(cnt);
                if(cnt>0){
                    cnt1++;
                }
                max=Math.max(cnt1,max);



            }
            max=Math.max(cnt1,max);

        }
        System.out.println(max);




    }
    static void com1(int []re, boolean[] visit, int start,  int r){
        String answer="";
        if(r==0){
            for(int i=0; i<re.length; i++){
                if(visit[i]==true){
                    answer+=re[i];

                    //System.out.println(re[i]+" ");
                }
            }
            s1.add(answer);
            return;
        }
        else{
            for(int i=start; i<re.length; i++){
                visit[i]=true;
                com1(re,visit,i+1,r-1);
                visit[i]=false;
            }
        }
    }

}

