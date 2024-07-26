import java.util.*;
public class ZigZagLinked{

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
        public static int size;

    public void addFrist(int data){//method
        //step 1=create new node
        Node newnode=new Node(data);
        size++;
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
         size++;
        //if head==null than startig and ending node itself 
        if(head==null){
            head=tail=newnode;
            return;
        }
        //
        tail.next=newnode;
        tail=newnode;
    }


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

       public void Zigzag(){
            //find mid
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next !=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid=slow;


            //reverse 2nd half

            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            Node left=head;
            Node right=prev;
            Node nextL,nextR;
            //alter merge
            while(left !=null && right != null){//jab take mera next null nhi hoth or right null nhi hotha tab tak
                nextL=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextL;


                left=nextL;
                right=nextR;
            }
          }

            public static void main(String args[]){
            ZigZagLinked l1=new ZigZagLinked();
            l1.addLast(1);
            l1.addLast(2);
            l1.addLast(3);
            l1.addLast(4);
            l1.addLast(5);
            l1.print();
            l1.Zigzag();
            l1.print();
    }
}