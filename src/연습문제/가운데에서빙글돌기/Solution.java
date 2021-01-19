package 연습문제.가운데에서빙글돌기;

public class Solution {
    public static void main(String args[]) {
        //n값 넣어주기
        int n = 5;
        //n*n만큼의 배열생성
        int[][] map = new int[n][n];
        int a = n / 2;//가운데 부터 시작하므로 가운데 숫자 확인
        map[n / 2][n / 2] = 1;
        //배열의 기준을 가운데로 잡는다.
        int i1 = a;
        int j1 = a;

        int cnt = 1;//배열에 숫자 채우기
        int cnt2 = 1;//규칙 오른쪽 위로 움직일때마다 +1해주기


        //n = 3  n/2 = 1   (a + cnt2)=3  cnt3=0   (a + cnt2)-cnt3 =3
        //n = 5  n/2 = 2   (a + cnt2)=6  cnt3=1   (a + cnt2)-cnt3 =5
        //n = 7  n/2 = 3   (a + cnt2)=9  cnt3=2   (a + cnt2)-cnt3 =7
        //n = 9  n/2 = 4   (a + cnt2)=12  cnt3=3   (a + cnt2)-cnt3 =9

        while (true){
            //오른쪾
            for (int k = a; k < a + cnt2; k++) {
                j1++;
                cnt++;
                map[i1][j1] = cnt;

            }
            //위쪽
            for (int k = a; k < a + cnt2; k++) {
                i1--;
                cnt++;
                map[i1][j1] = cnt;
            }

            cnt2++;

            //왼쪽
            for (int k = a; k < a + cnt2; k++) {
                j1--;
                cnt++;
                map[i1][j1] = cnt;
            }
            //아랫쪽
            for (int k = a; k < a + cnt2; k++) {
                i1++;
                cnt++;
                map[i1][j1] = cnt;
            }

            //만약 n이랑 (n/2+cnt2)-반복횟수랑 같으면 오른쪽끝까지가서 종료 n == (a + cnt2)-cnt3
            if (a*3==(a + cnt2)) {


                for (int k = a; k < a + cnt2; k++) {
                    j1++;
                    cnt++;
                    map[i1][j1] = cnt;

                }
                break;
            }
            //아니면 while문 반복
            else {
                cnt2++;
                continue;
            }
        }


        //2차원 배열 출력
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map.length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println(" ");
        }



    }
}
