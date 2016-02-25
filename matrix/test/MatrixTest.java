import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class MatrixTest{
   @Test
   public void fill_should_fill_the_value_in_matrix_if_row_and_colom_both_are_same() {
    Matrix matrix = new Matrix(1,1);
    int [] matrix_ = {1};
    matrix.fill(matrix_);
    assertTrue(matrix.isEqual(matrix));
   }

   @Test
   	public void fill_should_fill_the_value_in_matrix_if_row_is_less_then_colom() {
    Matrix matrix = new Matrix(2,3);
    int [] matrix_ = {1,2,2,3,2,4};
    matrix.fill(matrix_);
    assertTrue(matrix.isEqual(matrix));
   }

   @Test
   	public void fill_should_fill_the_value_in_matrix_if_colom_is_less_then_row() {
    Matrix matrix = new Matrix(4,2);
    int [] matrix_ = {1,2,2,3,2,4,23,55};
    matrix.fill(matrix_);
    assertTrue(matrix.isEqual(matrix));
   }
   @Test
   	public void fill_should_not_fill_the_value_in_matrix_if_given_ele_has_no_any_value() {
    Matrix matrix = new Matrix(0,0);
    int [] matrix_ = {};
    matrix.fill(matrix_);
    assertTrue(matrix.isEqual(matrix));
   }
 
   @Test
   public void add_should_add_the_2_matrix_if_row_and_column_is_same() {
    int [] expected_sum = {8,10,12,5,7,5};
    Matrix expected =new Matrix(2,2);
    expected.fill(expected_sum);
 
    Matrix matrix1 = new Matrix(2,2);
    int [] matrix_1 = {1,2,3,4,5,6};
    matrix1.fill(matrix_1);
 
    Matrix matrix2 = new Matrix(2,2);
    int [] matrix_2 = {7,8,9,1,2,3};
    matrix2.fill(matrix_2);
 
    Matrix actual= matrix1.add(matrix2);
    assertTrue(actual.isEqual(expected));
   }
   @Test
  public void add_should_detuct_null_matrix_if_both_can_not_added() {
    Matrix sum = new Matrix(0,0);
    Matrix matrix1 = new Matrix(2,3);
    int [] ele1 = {1,2,3,4,5,6};
    matrix1.fill(ele1);
 
    Matrix matrix2 = new Matrix(1,2);
    int [] ele2 = {3,4};
    matrix2.fill(ele2);
 
    Matrix addition_of_two_matrix= matrix1.add(matrix2);
    assertTrue(addition_of_two_matrix.isEqual(sum));
  }
  
  @Test
  public void multiply_should_multiply_of_two_matrix_if_row_and_colom_both_are1() {
    int[] expected_result = {1};
    Matrix expected = new Matrix(1,1);
    expected.fill(expected_result);

    Matrix matrix1 = new Matrix(1,1);
    int [] ele1 = {1};
    matrix1.fill(ele1);
 
    Matrix matrix2 = new Matrix(1,1);
    int [] ele2 = {1};
    matrix2.fill(ele2);
 
    Matrix multiplication_of_two_matrix= matrix1.multiply(matrix2);
    assertTrue(multiplication_of_two_matrix.isEqual(expected));
  }
}
