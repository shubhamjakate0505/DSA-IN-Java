import java.util.*;
public class Talling{
    public static int tail(int n){//2*n (floor size)
        //base
        if(n==0||n==1){
            return 1;
        }
        
        //work
        //verticle
        int vertical=tail(n-1);

        //horizantal

        int horizantal=tail(n-2);

        int totalway=vertical+horizantal;
        return totalway;
    }
    public static void main(String args[]){
        System.out.println(tail(3));
    }
}