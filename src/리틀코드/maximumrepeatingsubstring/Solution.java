package 리틀코드.maximumrepeatingsubstring;

class Solution {
    public int maxRepeating(String sequence, String word) {
        String w=word;
        int answer=0;
        while (w.length()<=sequence.length()){
            System.out.println(w);
            if(sequence.contains(w)){
                answer++;
                w+=word;
            }
            else{
                break;
            }
        }
        return answer;

    }
}
