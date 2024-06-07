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

            int [] s1Arr = new int[26];
            int [] s2Arr = new int[26];
            StringTokenizer st  = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            for(int j = 0; j < s1.length(); j++){
                int temp = s1.charAt(j);
                s1Arr[temp-97]++;
            }

            for(int j = 0; j< s2.length(); j++){
                int temp = s2.charAt(j);
                s2Arr[temp-97]++;
            }

            for(int j = 0; j < arr.length; j++){
                if(s1Arr[j] > s2Arr[j]){
                    arr[j] += s1Arr[j];
                }else{
                    arr[j] += s2Arr[j];
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}