import java.util.*;
public class UseingLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class Stack{
      
    }
    
    
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
       while(!s.isempty()){//till the stack is not empty
        System.out.println(s.Peek());
        s.Pop();

       }
    }
}