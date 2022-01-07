package DFSandBFS.사탕게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};

    static int N, max=0;
    static char [][] map;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new char[N][N];

        for(int i=0;i<N;i++) {
            String line = br.readLine();
            for(int j=0;j<N;j++) {
                map[i][j] = line.charAt(j);
            }
        }

        candy();
        System.out.println(max);
    }

    public static void candy() {
        for(int x=0;x<N;x++) {
            for(int y=0;y<N;y++) {

                for(int d=0;d<4;d++) { // 상 하 좌 우 인접한곳
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if(range(nx,ny) && map[x][y]!=map[nx][ny]) {
                        char temp = map[x][y];
                        map[x][y] = map[nx][ny];
                        map[nx][ny] = temp;

                        check(); //먹을 수 있는 사탕 개수 확인

                        temp = map[x][y];
                        map[x][y] = map[nx][ny];
                        map[nx][ny] = temp;
                    }
                }
            }
        }
    }

    public static boolean range(int x, int y) {
        return x>=0 && x<N && y>=0 && y<N;
    }

    public static void check() {

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                count(i,j);
            }
        }
    }

    public static void count(int x, int y) {

        int yy=y, xx=x, row=1, col=1;
        //연속된 행
        for(int i=y+1;i<N;i++) {
            if(map[x][yy]==map[x][i]) {
                row++;
                yy = i;
            }else break;
        }

        //연속된
        for(int i=x+1;i<N;i++) {
            if(map[xx][y]==map[i][y]) {
                col++;
                xx = i;
            }else break;
        }

        int result = Math.max(row, col);
        max = Math.max(result, max);
    }

}
