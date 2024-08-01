import java.util.*;
public class UseingLL{

    // ------Node class-------
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // ------------------------------
    static class Stack{
      static Node head=null;//At the starting head is null initil

      public static boolean isempty(){
        return head==null;
      }

    // push
    public static void push(int data){
        Node newnode=new Node(data);//New Node Created
        if(isempty()){
            head=newnode;//if LL is null than make head==newnode
            return;
        }
     
        newnode.next=head;
        head=newnode;
    }
    //pop
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
        //peek
        public static int peek(){
             if(isempty()){
            return -1;
        }
        return head.data;
        }
    }
    
    
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
       while(!s.isempty()){//till the stack is not empty
        System.out.println(s.peek());
        s.pop();

       }
    }
}