import java.util.*;
public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    //add
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //remove
    public int removefrist(){
        if(head==null){
            System.out.print("NUll");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=head;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }





    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        DoubleLL ddl=new DoubleLL();
        ddl.addFirst(2);
        ddl.addFirst(3);
        ddl.addFirst(2);
        ddl.print();
        System.out.println(ddl.size);
        ddl.removefrist();
        ddl.print();
    }
}