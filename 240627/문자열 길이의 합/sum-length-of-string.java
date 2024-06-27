import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());

        int total = 0;
        int lengthSum = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();
            if(str.charAt(0) == 'a'){
                total++;
            }
            lengthSum += str.length();
        }

        System.out.println(lengthSum + " " + total);
    }
}