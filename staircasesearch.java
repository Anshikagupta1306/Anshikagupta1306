import java.util.*;
public class staircasesearch {
    public static void search(int mat[][],int key){
        int row=0;
        int col=mat[0].length-1;
        while(row<mat.length&&col>=0){
            if(mat[row][col]==key){
                System.out.println("key found at row "+row+" col "+col);
                return;
            }
            else if(key<mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},
                      {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        search(mat, 7);
    }
}
