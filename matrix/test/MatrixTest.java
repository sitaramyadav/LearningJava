import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class MatrixTest{
   @Test
   public void fill_should_fill_the_value_in_matrix_if_row_and_colom_both_are_same() {
    Matrix matrix = new Matrix(1,1);
    int [] elements = {1};
    matrix.fill(elements);
    assertTrue(matrix.isEqual(matrix));
   }

   @Test
   	public void fill_should_fill_the_value_in_matrix_if_row_is_less_then_colom() {
    Matrix matrix = new Matrix(2,3);
    int [] elements = {1,2,2,3,2,4};
    matrix.fill(elements);
    assertTrue(matrix.isEqual(matrix));
   }

   @Test
   	public void fill_should_fill_the_value_in_matrix_if_colom_is_less_then_row() {
    Matrix matrix = new Matrix(4,2);
    int [] elements = {1,2,2,3,2,4,23,55};
    matrix.fill(elements);
    assertTrue(matrix.isEqual(matrix));
   }
   @Test
   	public void fill_should_not_fill_the_value_in_matrix_if_given_ele_has_no_any_value() {
    Matrix matrix = new Matrix(0,0);
    int [] elements = {};
    matrix.fill(elements);
    assertTrue(matrix.isEqual(matrix));
   }
}
