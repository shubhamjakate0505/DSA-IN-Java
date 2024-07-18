import java.util.*;
public class PairNum{
    public static void arrpair(int number[]){
         int tp=0;
        for(int i=0;i<number.length;i++){
           
            int curr=number[i];//2,3,4,5,6
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr + ","+number[j]+")");
                tp++;
            }
             System.out.println();
             
        }
       System.out.println("TOtal Pair :"+tp);
    }
    public static void main(String args[]){
        int number[]={2,3,4,5,6};
        arrpair(number);

    }
}