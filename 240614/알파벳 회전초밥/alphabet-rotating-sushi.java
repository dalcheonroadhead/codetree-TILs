import java.io.*;
import java.util.*;

public class Main {
    
    static int [] alphabet = new int [26];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        // 각 알파벳의 문자열 A에서의 위치 입력 
        for(int i = 0; i <26; i ++){
            alphabet[((int)A.charAt(i)) - 97] = i;
        }

        String B = br.readLine();

        int cnt = 1;
        for(int i = 0; i < B.length()-1; i ++) {
            if(alphabet[(int) B.charAt(i) - 97] >= alphabet[(int) B.charAt(i+1) - 97]){
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}