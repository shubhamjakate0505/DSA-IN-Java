import java.util.*;
public class Half{
    public static void half(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){// for the Empty spaces
                System.out.print(" ");
            }
            //for the Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        half(4);
    }
}