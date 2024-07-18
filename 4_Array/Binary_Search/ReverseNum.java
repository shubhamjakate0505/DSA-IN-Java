import java.util.*;
public class ReverseNum{
    public static void swap(int number[]){
        int frist=0,last=number.length-1;
        while(frist<last){
            int temp=number[last];
            number[last]=number[frist];
            number[frist]=temp;

            frist++;
            last--;
        }
    }
    
    
    
    public static void main(String args[]){
        int number[]={2,3,4,5,8,5};
        swap(number);
        //print
        for(int i=0;i<=number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}