import java.util.*;
public class Linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){//constractor
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    
    public void addFrist(int data){//method
        //step 1=create new node
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
       
        //setp2= newnode next=head
        newnode.next=head;//link
        //step3=head=head
        head=newnode;
    }
    public void addLast(int data){
        //1.create new node
        Node newnode=new Node(data);
        //if head==null than startig and ending node itself 
        if(head==null){
            head=tail=newnode;
            return;
        }
        //
        tail.next=newnode;
        tail=newnode;
    }
    //printing linked list
    public void print(){
        //base case
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){//jab tak head==0 tab tak loop chalega
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //add ele at middle
    public void add(int idx,int data){

        if(idx==0){
            addFrist(data);
            return;
        }
        //create new node
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }

        //i=idx-1;temp->prev

        newnode.next=temp.next;
        temp.next=newnode;
        

    }

    public static void main(String args[]){
        Linkedlist l1=new Linkedlist();
        
        l1.addFrist(2);
        
        l1.addFrist(1);
       
        l1.addLast(3);
       
        l1.addLast(4);
        l1.add(2,9);
        l1.add(0,12);
        l1.print();
        

    }
}