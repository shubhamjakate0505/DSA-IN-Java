import java.util.*;
public class Gridway{
    public static int Gridway(int i,int j,int n,int m){//agar mai i,j cell par khada hu or mere pass n*m col and row haai to
            //base case
            if(i==n-1 && j==n-1){//condition for the last cell
                return 1;//one way Exit
            }else if(i==n || j==n){//boundary cross condition
                return 0;
            }
            int w1=Gridway(i+1,j,n,m);//Down
            int w2=Gridway(i,j+1,n,m);//Right
            return w1+w2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(Gridway(0,0,n,m));//start(0,0) cell se
        
    }
}