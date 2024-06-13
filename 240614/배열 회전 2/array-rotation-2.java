import java.io.*;
import java.util.*;

public class Main {
    
    static int n, d;
    static int [][] matrix;
    static int [] idx = new int []{1,0,-1,0};
    static int [] idy = new int []{0,1,0,-1};

    static int [] revIdx = new int []{0,1,0,-1};
    static int [] revIdy = new int []{1,0,-1,0};

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 1. 입력 받기 
        n = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        matrix = new int [n][n];

        for(int i = 0; i < n; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j ++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        // 2. 중앙 확인 및 회전  중앙에서 가로 갈수록, jump 하는 수가 늘어나야 한다.
        if( d >= 0) {
           for(int k =0; k <(d/45); k++){
                int jump = 1; 
                for(int i = (n/2)-1; i >= 0; i--){
                    rotate(i,i,jump++);
                }
           }     
        }else {
             for(int k =0; k <(Math.abs(d)/45); k++){
                int jump = 1; 
                for(int i = (n/2)-1; i >= 0; i--){
                    rev_rotate(i,i,jump++);
                }
           }   
        }


        // 3. 출력
        for(int [] temp : matrix){
           for(int a : temp){
                System.out.print(a + " ");
           }
           System.out.println();
        }

    }

    public static void rotate(int x, int y, int jump) {
        
        int temp = matrix[x][y];

        int prevX = x;
        int prevY = y;

        for(int i = 0; i < 4; i++){
            // 초기값
            int nx = prevX;
            int ny = prevY;

            for(int j = 0; j < 2; j++) {
                // 초기값에서 해당 방향으로 점프
                nx += idx[i] * jump;
                ny += idy[i] * jump; 
                // 이동한 값을 이전 위치에 집어넣기
                matrix[prevX][prevY] = matrix[nx][ny];
                // 이전 위치 없데이트 
                prevX = nx;
                prevY = ny;

            }
        }

        matrix[x][y+jump] = temp;
    }

        public static void rev_rotate(int x, int y, int jump) {
        
        int temp = matrix[x][y];

        int prevX = x;
        int prevY = y;

        for(int i = 0; i < 4; i++){
            // 초기값
            int nx = prevX;
            int ny = prevY;

            for(int j = 0; j < 2; j++) {
                // 초기값에서 해당 방향으로 점프
                nx += revIdx[i] * jump;
                ny += revIdy[i] * jump; 
                // 이동한 값을 이전 위치에 집어넣기
                matrix[prevX][prevY] = matrix[nx][ny];
                // 이전 위치 없데이트 
                prevX = nx;
                prevY = ny;
            }
        }

        matrix[x+jump][y] = temp;
    }
}