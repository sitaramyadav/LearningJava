import java.util.Arrays;
public class Matrix {
   private int row,colom;
   private int[][] matrix;
   public Matrix(int row,int colom){
      this.row = row;
      this.colom = colom;
      this.matrix = new int[row][colom];
   }
   public void fill(int[] ele){
      int k=0;
      for(int i =0;i<row;i++){
         for(int j=0;j<colom;j++){
            this.matrix[i][j]=ele[k++];
         }
      }
   }
   public boolean isEqual(Matrix matrix){
     return Arrays.deepEquals(matrix.matrix,this.matrix);
   }
}
