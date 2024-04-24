import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int AAge = sc.nextInt();
        char AGender = sc.next().charAt(0);
        
        int BAge = sc.nextInt();
        char BGender = sc.next().charAt(0);
        
        if(isMan(AAge, AGender) || isMan(BAge, BGender)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static boolean isMan(int age, char gender){
        return (age >= 19 && gender == 'M');
    }
}