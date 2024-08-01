import java.util.*;
public class ThiredQ{

     public static void pushatBotton(Stack<Integer> s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }           
            int top=s.pop();//har bar upar jate samay pop karna hai ,pop ko store kiya top mai
            pushatBotton(s,data);//calling for next level
            s.push(top);//return aate hua apne remove element to push karna hai
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){//agar khali stack hai to kuch karna hi nahi hai 
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushatBotton(s,top);

    }
    public static void printStack(Stack<Integer> s){
        //jab tak hamara stack empty nhi hoth tab tak hum print karte jayege apne pop ko
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        reverseStack(s);
        printStack(s);
        //1,2,3
        
    }
}