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
