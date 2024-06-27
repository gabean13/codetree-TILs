import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String[] arr = new String[4];
        arr[0] = st.nextToken();

        for(int i = 1; i < 4; i++){
            st = new StringTokenizer(bf.readLine());
            arr[i] = st.nextToken();
        }

        for(int i = 3; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}