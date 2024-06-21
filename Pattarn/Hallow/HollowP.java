import java.util.*;
public class HollowP{
    public static void Hollow(int row,int col){
        for(int i=1;i<=row;i++){//Row
            for(int j=1;j<=col;j++){
                if(i==1 ||i==row||j==1||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }

    }
    
    
    public static void main(String args[]){
        Hollow(5,10);
    }
}