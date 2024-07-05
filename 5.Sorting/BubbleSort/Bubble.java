import java.util.*;
public class Bubble{
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){//Number of turn i.e n-1
    
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int tepm=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tepm;
                    
                }
                
                
            }

            
    System.out.println("number:"+swap);
        }
        
    }
    public static void Printarray(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        bubbleSort(arr);
        Printarray(arr);
    }
}