import java.util.*;
public class QueArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;//starting Position
        Queue(int n){
            arr[]=new int[n];
            size=n;
            rear=-1;
        }
    }
    public static boolean isEmpty(){
        if(Queue==null){
            return rear==-1;
        }
    }
    //add
    public static int add(int data){
        if(rear==size-1){//Queue Full 
            System.out.println("Queue Is Full");
            return

        }
        rear=rear+1;
        arr[rear]=data;
    }
    public static void main(String args[]){
println("sdklds");
    }
}