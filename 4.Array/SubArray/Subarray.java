import java.util.*;
public class Subarray{
    public static void sub(int Number[]){
        int total=0;
        for(int i=0;i<Number.length;i++){
            int start=i;
            for(int j=i;j<Number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(Number[k]+" ");
                    total++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total : "+total);
    }
    
    
    public static void main(String args[]){
        int Number[]={2,4,6,8,10};
        sub(Number);
    }
}