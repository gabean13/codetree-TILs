import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        int str1Length = str1.length();
        String str2 = sc.next();
        int str2Length = str2.length();

        if(str1Length > str2Length){
            System.out.println(str1 + " " + str1Length);
        }else if(str1Length < str2Length){
            System.out.println(str2 + " " + str2Length);
        }else{
            System.out.println("same");
        }
    }
}