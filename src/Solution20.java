import java.util.ArrayList;
public class Solution20 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length,col = matrix[0].length;
        if(row <= 0||col <= 0){
            return null;
        }
        ArrayList<Integer> printList = new ArrayList<Integer>();
        int start = 0;
        while(start*2 < row && start*2 < col){
            printCircle(printList,matrix,start,row,col);
            start++;
        }
        return printList;
    }
    public void printCircle(ArrayList<Integer> circle,int[][] matrix,int start,int row,int col){
        int endCol = col-start-1,endRow = row-start-1;
        for(int i = start;i <= endCol;i++){
            circle.add(matrix[start][i]);
        }
        //如果要打印第二步，至少要有两列
        if(start < endRow){
            for(int i = start+1;i <= endRow;i++){
                circle.add(matrix[i][endCol]);
            }
        }
        //如果要打印第三步，至少要有两行两列
        if(start < endCol && start < endRow){
            for(int i = endCol-1;i >= start;i--){
                circle.add(matrix[endRow][i]);
            }
        }
        //如果要打印第二步，至少要有三行两列
        if(start < endCol && start < endRow-1){
            for(int i = endRow-1;i > start;i--){
                circle.add(matrix[i][start]);
            }
        }
    }
}