package 위클리챌린지.오주차;

class Other {
    public int solution(String word) {
        char c1[]={'A','E','I','O','U'};

        int temp=781;
        /*a=1;
        b=782;
        c=1563;*/
        int answer=0;

        for(int i=0; i<word.length(); i++){
            for(int j=0; j<c1.length; j++){
                if(word.charAt(i)==c1[j]){
                    answer+= j*temp+1;
                }
            }
            temp=temp/5;
        }
        return answer;
    }
    
}