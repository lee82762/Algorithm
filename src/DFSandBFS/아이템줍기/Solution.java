package DFSandBFS.아이템줍기;

import java.util.*;
class Solution {
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static class Point {
        int x;
        int y;
        int depth;

        public Point(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] board = new int[105][105];
        int answer=0;
        int numR = rectangle.length;

        //사각형을 1로 채움
        for (int i = 0; i < numR; i++) {
            int[] r = rectangle[i];
            for (int x = r[0] * 2; x <= r[2] * 2; x++) {
                for (int y = r[1] * 2; y <= r[3] * 2; y++) {
                    board[x][y] = 1;
                }
            }
        }
        //안쪽을 0으로 채움
        for (int i = 0; i < numR; i++) {
            int[] r = rectangle[i];
            for (int x = r[0] * 2 + 1; x <= r[2] * 2 - 1; x++) {
                for (int y = r[1] * 2 + 1; y <= r[3] * 2 - 1; y++) {
                    board[x][y] = 0;
                }
            }
        }
        boolean[][] visited = new boolean[105][105];

        Point start = new Point(characterX * 2, characterY * 2, 0);
        Queue<Point> q = new LinkedList<>();
        visited[characterX * 2][characterY * 2] = true;
        q.add(start);

        while (!q.isEmpty()) {
            Point front = q.poll();
            if (front.x == itemX * 2 && front.y == itemY * 2) {
                answer = front.depth;
                break;
            }
            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + front.x;
                int ny = dy[k] + front.y;
                if (!visited[nx][ny] && board[nx][ny] == 1) {
                    q.add(new Point(nx, ny, front.depth + 1));
                    visited[nx][ny] = true;
                }
            }
        }

        return answer/2;
    }
}
