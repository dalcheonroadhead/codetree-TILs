import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        multiplyThree(0,1);
    }

    public static void multiplyThree(int depth, int current) {
        if(depth == n){
            System.out.println(current);
            return;
        }

        multiplyThree(depth+1, current*3);
    }
}