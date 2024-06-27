import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int i = 1;
        while(st.hasMoreTokens()){
            if(i == 1){
                i--;
                System.out.println(st.nextToken());
            }else{
                i++;
                st.nextToken();
            }
        }
    }
}