package 연습문제.새마을금고1번;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String arg[]){
        String exp1="2x^5 + 3x^3 + 2x^1";
        String exp2="6x^6 + 4x^4 + 3x^3 + 2x^2";
        exp1=exp1.replace(" + "," ");
        exp2=exp2.replace(" + "," ");
        String s1[]=exp1.split(" ");
        String s2[]=exp2.split(" ");

        ArrayList<String>st=new ArrayList<>();

        for(int i=0; i<s1.length; i++){
            st.add(s1[i]);
        }

        for(int i=0; i<s2.length; i++){
            st.add(s2[i]);
        }
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0; i<st.size(); i++){
            String s=st.get(i);
            s=s.substring(s.length()-1,s.length());
            a1.add(Integer.parseInt(s));
        }

        Collections.sort(a1,Collections.reverseOrder());
        ArrayList<String> re1=new ArrayList<>();

        boolean visit[]=new boolean[a1.size()];
        for(int j=0; j<a1.size(); j++) {
            int a = a1.get(j);
            for (int i = 0; i < st.size(); i++) {
                String s = st.get(i);
                String re = s.substring(s.length() - 1, s.length());
                int a2 = Integer.parseInt(re);
                if (a2 == a &&visit[i]==false) {
                    re1.add(s);
                    visit[i]=true;

                }

            }
        }
        for(int i=0; i<5; i++){
        }

        ArrayList<String>result=new ArrayList<>();
        for(int i=0; i<a1.size()-1; i++){
            String s=re1.get(i);
            String w=re1.get(i+1);


            if(a1.get(i)==a1.get(i+1)){
                String w1=s.substring(0,1);
                String w2=s.substring(0,1);
                int a=Integer.parseInt(w1)+Integer.parseInt(w2);
                Integer.toString(a);


                String po=Integer.toString(a)+s.substring(1,s.length());
                result.add(po);
                i++;

            }
            else{
                result.add(s);
            }

        }
        result.add(re1.get(re1.size()-1));


        String answer="";
        for(int i=0; i<result.size(); i++){
            if(i==result.size()-1){
                answer+=result.get(i);
            }
            else {
                answer += result.get(i) + " + ";
            }
        }
        System.out.println(answer);

    }
}
