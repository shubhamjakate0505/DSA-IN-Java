import java.util.*;
public class FristQ{
    public static void pushatBotton(Stack<Integer> s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            
            int top=s.pop();//har bar upar jate samay pop karna hai ,pop ko store kiya top mai
            pushatBotton(s,data);//calling for next level
            s.push(top);//return aate hua apne remove element to push karna hai


    }
   
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushatBotton(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
            // s.pop();
        }

    }
}