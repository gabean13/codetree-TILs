import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String[] arr = new String[3];
        arr[0] = st.nextToken();

        int max = arr[0].length();
        int min = arr[0].length();

        for(int i = 1; i < 3; i++){
            st = new StringTokenizer(bf.readLine());
            arr[i] = st.nextToken();
            int length = arr[i].length();
            if(length > max){
                max = length;
            }
            if(length < min){
                min = length;
            }
        }

        System.out.println(max-min);
    }
}