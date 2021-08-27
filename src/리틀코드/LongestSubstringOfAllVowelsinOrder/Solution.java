package 리틀코드.LongestSubstringOfAllVowelsinOrder;


class Solution {
    public int longestBeautifulSubstring(String word) {
        String []arr={"a","e","i","o","u"};

        String words[]=word.split("");
        int answer=0;
        int cnt=0;
        int j=0;
        for(int i=0; i<words.length-1; i++){
            String temp=words[i];

            if(temp.equals(arr[j])&&words[i+1].equals(arr[j])){
                cnt++;
    /*          System.out.println(temp);
              System.out.println(cnt);*/
            }
            else if(temp.equals(arr[j])&&!words[i+1].equals(arr[j])){
                cnt++;
                j++;
  /*            System.out.println(temp);
              System.out.println(cnt);*/
            }
            else if(!temp.equals(arr[j])){
                cnt=0;
                j=0;

/*              System.out.println(temp);
              System.out.println(cnt);*/
            }

            if(i+1==words.length-1){
                if(words[i+1].equals(arr[j])){
                    cnt++;
                    j++;
                }

            }

            if(j==arr.length){
                answer=Math.max(answer,cnt);
                cnt=0;
                j=0;
            }

        }
        return answer;
    }
}