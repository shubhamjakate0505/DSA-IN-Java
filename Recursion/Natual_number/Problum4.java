import java.util.*;
public class Problum4{

    public static int sumn(int n){
        if(n==1){
           return 1;
        }
        int snm1=sumn(n-1);
        int sn=n+snm1;
        return sn;
        }
    public static void main(String args[]){
       int n=5;
       System.out.println(sumn(n));

    }
}