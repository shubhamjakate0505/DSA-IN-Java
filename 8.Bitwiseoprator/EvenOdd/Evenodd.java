import java.util.*;
public class Evenodd{
    public static void Evenod(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            //even
            System.out.println("Number is even:"+n);
        
        }else{
            System.out.println("Number is odd:"+n);
        }
        
    }
    public static int getit(int n,int i){
        int bitmaks=1<<i;
        if((n&bitmaks)==0){
            return 0;

        }
        else{
            return 1;
        }
    }

    public static boolean ispower(int n){

        return (n& (n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(getit(3,2));
        // Evenod(11);
        // Evenod(7);
        // Evenod(12);
        // Evenod(100);
    }
}