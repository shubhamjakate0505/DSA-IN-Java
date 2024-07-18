import java.util.*;
public class Sodu{
    public static boolean isSafe(int suduko[][],int row,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(suduko[i][col]==digit){
                return false;
            }
        }

        //row
        for(int j=0;j<=8;j++){
            if(suduko[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(suduko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokosolvr(int suduko[][],int row,int col){
        //base
        if(row==9){//getting final Solution 
            return true;
        }

        // recursion
        int nextRow=row,nextCol=col+1;//we are checking ele with same row and next col
        //Value of NextRow will be increment when col+1==9
        if(col+1==9){
            nextRow=row+1;//Cheking Next Row
            nextCol=0;
        }

        if(suduko[row][col]!=0){// when already element is prasent than call for next row and col
            return sudokosolvr(suduko,nextRow,nextCol);
        }
       
        for(int digit=1;digit<=9;digit++){
            if(isSafe(suduko,row,col,digit)){ //ky suduko ke upar row, col, par digit ko baitanar safe hai
                    suduko[row][col]=digit;// to Baita Do
                        if(sudokosolvr(suduko,nextRow,nextCol)){//and calculet next row if the soln exit than return true
                            return true;
                        }
                        //when it return flase than don't place element; 
                         suduko[row][col]=0;

            }

        }
        return false;
    }
    public static void printsodoko(int suduko[][]){
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                System.out.print(suduko[i][j]+" ");
            }
             System.out.println();
        }
       
    }
    public static void main(String args[]){
        int suduko[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };


        if(sudokosolvr(suduko,0,0)){
            System.out.println("Solution Exit");
            printsodoko(suduko);
        }else{
            System.out.println("sol not exit");
        }
    }
}