import java.util.*;
public class Largest_number{
    public static int grater(int number[]){
        int largenumber=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largenumber<number[i]){
                largenumber=number[i];
            }
        }
        return largenumber;
    }
    
    public static void main(String args[]){
        int number[]={2,3,8,4,5};
        System.out.println("Largest number is : "+grater(number));

    }
}