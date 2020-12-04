package 연습문제.스킬트리;

class Solution {
    //CBD이면 C가나와야 B가 나올 수 있다.
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++){
            int idx=0;
            boolean flag=true;
            for(int j=0; j<skill_trees[i].length(); j++){
                char c=skill_trees[i].charAt(j);

                for(int k=idx; k<skill.length(); k++){
                    char c1=skill.charAt(k);
                    if(c==c1){
                        if(k==idx){
                            idx++;
                        }
                        else{
                            flag=false;
                        }
                    }

                }

            }
            if(flag==true){
                answer++;
            }
        }
        return answer;
    }
}
