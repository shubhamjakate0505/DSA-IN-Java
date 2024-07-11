import java.util.*;
public class Short{
    public static float Path(int str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //East
            else if(dir=='E'){
                x--;
            }
            //WEST
            else{
                x++;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str="EEWWSNNESW";
        System.out.print(Path(str));
    }
}