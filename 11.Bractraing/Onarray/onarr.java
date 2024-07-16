import java.util.*;
public class onarr{
    public static void changearry(int arr[],int i,int val){
        //base 
        if(i==arr.length){
           printarr(arr);
           return;
        }
        //kam Recuretion

        arr[i]=val;
        changearry(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    public static void main(String args[]){
        int arr[]=new int[5];
        changearry(arr,0,1);
        printarr(arr);

    }
}