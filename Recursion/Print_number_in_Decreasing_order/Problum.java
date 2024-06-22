import java.util.*;
public class Problum{
    public static void Desc(int n){
        if(n==1){
            System.out.println(1);
            return;

        }
        System.out.println(n+" ");
        Desc(n-1);

    }

    public static void main(String args[]){
        int n=10;
        Desc(n);
    }
}