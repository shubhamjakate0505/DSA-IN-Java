import java.util.*;
public class Power{
    public static int pwd(int x,int n){
    if(n==0){
        return 1;
    }
    return x*pwd(x,n-1);    

    }

    public static int OptimizedAns(int x,int n){
        if(n==0){
            return 1;
        }
        int half=OptimizedAns(x,n/2);
        int halfsq=half*half;

        if(n%2!=0){
            halfsq=x*halfsq;
        }
        return halfsq;
    }

    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(OptimizedAns(x,n));
    }
}