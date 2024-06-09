import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 0. 값 입력 
        int n = Integer.parseInt(br.readLine());
        int [][] coor = new int [n][2];

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = 0;
        int maxY = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer st  = new StringTokenizer(br.readLine());
            coor[i][0] = Integer.parseInt(st.nextToken());
            coor[i][1] = Integer.parseInt(st.nextToken());

            maxX = Math.max(coor[i][0], maxX);
            maxY = Math.max(coor[i][1], maxY);
        }

        boolean [][] isVisited = new boolean[maxX+10][maxY+10];

        for(int i = 0; i < n ; i ++ ){
            for(int j = coor[i][0]; j < (coor[i][0]+10); j ++){
                for (int k = coor[i][1]; k <(coor[i][1]+10); k ++){
                    isVisited[j][k] = true;
                }
            }
        }

        int cnt = 0;

        for(int i = 0; i < isVisited.length; i ++){
            for(int j = 0; j<isVisited[0].length; j++){
                if(isVisited[i][j]) cnt++;
            }
        }
  
        System.out.println(cnt);
    }
}