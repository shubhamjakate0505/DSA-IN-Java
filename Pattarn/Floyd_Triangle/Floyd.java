import java.util.*;
public class Floyd{
    public static void Tringal(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                
                counter++;
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Tringal(5);
    }
}