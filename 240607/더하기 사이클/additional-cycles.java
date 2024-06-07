import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int first = N;

        int cnt =0;
        int newOne = 0;

        while(true) {
            int a = N/10;
            int b = N%10;
            int second = a+b;
            newOne = (b*10) + (second%10);

            cnt++;

            if(newOne == first){
                break;
            }else{
                N = newOne;
            }
        }

        System.out.println(cnt);

    }
}