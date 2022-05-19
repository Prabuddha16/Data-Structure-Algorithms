package Matrix.SpirallyTraversing;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c)
    {
        ArrayList<Integer> res=new ArrayList<>();

        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;

        int direction=0;
        // 0 -> move rightward
        // 1 > move downward
        // 2 -> move leftward
        // 3 -> move upward

        while(top<=bottom && left<=right){
            if(direction==0){
                for(int i=left;i<=right;i++){
                    res.add(matrix[top][i]);
                }
                top++;
            }else if(direction==1){
                for(int i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            else if(direction==2){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(direction==3){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            direction=(direction+1)%4;
        }
        return res;
    }
}
