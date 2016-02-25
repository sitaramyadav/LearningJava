import java.util.Arrays;
public class Matrix {
   private int row,column;
   private int[][] matrix;
   public Matrix(int row,int column){
      this.row = row;
      this.column = column;
      this.matrix = new int[row][column];
   }
   public void fill(int[] ele){
      int k=0;
      for(int i =0;i<row;i++){
         for(int j=0;j<column;j++){
            this.matrix[i][j]=ele[k++];
         }
      }
   }
   public boolean isEqual(Matrix matrix){
     return Arrays.deepEquals(matrix.matrix,this.matrix);
   }

   // public String toString(){
   //   String result="";
   //   for (int i=0;i<this.row;i++) {
   //     for (int j=0;j<this.column;j++) {
   //       result = result+this.matrix[i][j]+" ";
   //     }
   //     result = result +" \n";
   //   }
   //   return result;
   // }
    public Matrix add(Matrix _matrix) {
     Matrix result = new Matrix(this.row ,this.column);
     int[] result_ = new int[row*column];
     if(!(_matrix.row ==this.row && _matrix.column ==this.column))
       return new Matrix(0,0);
     for (int k=0,i=0;i<this.row;i++) {
       for (int j=0;j<this.column ;j++) {
         result_[k++]=this.matrix[i][j]+_matrix.matrix[i][j];
       }
     }
     result.fill(result_);
     return result;
   }
  public Matrix multiply(Matrix matrix){
    Matrix result = new Matrix(this.row,matrix.column);
    int[] result_ = new int[this.row*matrix.column];
    if(!(this.row==matrix.row && this.column==matrix.column))
      return new Matrix(0,0);
    for (int i=0;i< this.row;i++){
      for (int l=0,j=0;j< this.column ;j++) {
          int multiplication = 0;
        for (int k = 0; k<matrix.column;k++) {
          multiplication=this.matrix[i][k]*matrix.matrix[k][j]+multiplication;
        }
          result_[l++] = multiplication;
      }
    }
    result.fill(result_);
    return result;
  }
}
