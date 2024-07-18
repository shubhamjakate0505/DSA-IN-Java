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

            
    // System.out.println("number:"+swap);
        }
        
    }
    public static void Printarray(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){//for the number of iteration
            int minpos=i;// supose curr position
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j])//agar mispos is grather than another variable to mera min variable nahi hai to update karo value
                {
                    minpos=j;
                }
            } 
        //swap
        int tepm=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=tepm;
        }

    }
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //fnding to current pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        // bubbleSort(arr);
        // selectionsort(arr);
        insertion(arr);

        Printarray(arr);
    }
}