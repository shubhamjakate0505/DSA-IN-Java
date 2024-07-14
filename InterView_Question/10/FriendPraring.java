import java.util.*;
public class FriendPraring{
    
    public static int paring(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice 
        //singal
        int fnm1=paring(n-1);
        
        
        //paring
        int fnm2=paring(n-2);
        int pairways=(n-1)*fnm2;//ek ke sath pair banaliya to fir kitne ways hai

        //total way
        int totalway=fnm1+pairways;
        return totalway;
    }
    
    
    public static void main(String args[]){
        System.out.println(paring(3));

    }
}