import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int [] arr = new int [26];
    static boolean [] isVisited; 

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i ++) {

            isVisited = new boolean[26];
            StringTokenizer st  = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            for(int j = 0; j < s1.length(); j++){
                int temp = s1.charAt(j);
                if(!isVisited[temp-97]){
                    arr[temp-97]++;
                    isVisited[temp-97] = true;
                }
            }

            for(int j = 0; j< s2.length(); j++){
                int temp = s2.charAt(j);
                if(!isVisited[temp-97]){
                    arr[temp-97]++;
                    isVisited[temp-97] = true;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}