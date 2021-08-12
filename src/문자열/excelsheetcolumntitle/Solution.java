package 문자열.excelsheetcolumntitle;

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();
        while (n!=0) {
            n--;
            char ch = (char) (n % 26 + 'A');
            System.out.println(ch);
            sb.append(ch);
            n/=26;
        }
        return sb.reverse().toString();

    }
}
