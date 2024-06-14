import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < s.length(); i++){
            if(i==0){
                sb.append(Integer.toBinaryString(Character.getNumericValue(s.charAt(i))));
            }else {
                int temp = Character.getNumericValue(s.charAt(i));

                if(temp <= 1){
                    sb.append(0).append(0).append(Integer.toBinaryString(temp));
                }else if(temp < 4){
                    sb.append(0).append(Integer.toBinaryString(temp));
                }else {
                    sb.append(Integer.toBinaryString(temp));
                }
            }
        }
        System.out.println(sb);
    }
}