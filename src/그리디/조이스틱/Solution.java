package 그리디.조이스틱;

//스스로 풀지 못한 문제(좌,우 판별 이해)
class Solution {
    public int solution(String name) {
        int answer = 0;
        int a=name.length()-1;

        for(int i=0; i<name.length(); i++){
            //위아래 판별
            int up=name.charAt(i)-'A';
            int down=1+'Z'-name.charAt(i);

            answer+=Math.min(up,down);

            //좌우판별
            int next=i+1;
            while (next<name.length()&& name.charAt(next)=='A'){
                next++;
            }
            a=Math.min(a,2*i+name.length()-next);
        }
        answer+=a;
        return answer;
    }
}
