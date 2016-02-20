import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class ComplexNumberTest{
	@Test
	public void should_be_represented_in_x_plus_i_y_form(){
		ComplexNumber a = new ComplexNumber(2,3);
		assertEquals("2+3i",a.toString());
	}

	@Test
	public void should_be_represented_in_x_minus_i_y_form_for_negative_imaginary_numbers(){
		ComplexNumber a = new ComplexNumber(2,-3);
		assertEquals("2-3i",a.toString());	
	}
	@Test
	public void should_be_represented_in_minus_x_minus_i_y_form_for_negative_real_and_imaginary_numbers(){
		ComplexNumber a = new ComplexNumber(-2,-3);
		assertEquals("-2-3i",a.toString());	
	}

	@Test
	public void should_be_represented_in_minus_x_plus_i_y_form_for_negative_real_and_positive_imaginary_numbers(){
		ComplexNumber a = new ComplexNumber(-2,3);
		assertEquals("-2+3i",a.toString());	
	}

	@Test
	public void should_be_represented_in_x_form_when_only_real_part_exists(){
		ComplexNumber a = new ComplexNumber(2,0);
		assertEquals("2",a.toString());
	}

	@Test
	public void should_be_represented_in_negative_x_form_when_only_negative_real_part_exists(){
		ComplexNumber a = new ComplexNumber(-2,0);
		assertEquals("-2",a.toString());
	}

	@Test
	public void should_be_represented_in_yi_form_when_only_imaginary_part_exists(){
		ComplexNumber a = new ComplexNumber(0,2);
		assertEquals("2i",a.toString());
	}

	@Test
	public void should_be_represented_in_minus_yi_form_when_only_negative_imaginary_part_exists(){
		ComplexNumber a = new ComplexNumber(0,-2);
		assertEquals("-2i",a.toString());
	}

	@Test
	public void should_be_represented_in_i_form_when_only_imaginary_part_is_1(){
		ComplexNumber a = new ComplexNumber(2,1);
		assertEquals("2+i",a.toString());
	}
	@Test
	public void should_be_represented_in_minus_i_form_when_only_imaginary_part_is_minus1(){
		ComplexNumber a = new ComplexNumber(0,-1);
		assertEquals("-i",a.toString());
	}

	@Test
	public void should_be_represented_in_0_form_when_nothing_exists(){
		ComplexNumber a = new ComplexNumber(0,0);
		assertEquals("0",a.toString());
	}

	@Test
	public void a_complex_number_is_equal_to_itself(){
		ComplexNumber a = new ComplexNumber(1,2);
		assertEquals(a,a);	
	}

	@Test
	public void two_complex_numbers_are_equal_if_they_have_same_values(){
		ComplexNumber a = new ComplexNumber(1,2);
		ComplexNumber b = new ComplexNumber(1,2);
		assertEquals(a,b);	
	}

	@Test
	public void two_complex_numbers_are_not_equal_if_they_have_different_real_values(){
		ComplexNumber a = new ComplexNumber(1,2);
		ComplexNumber b = new ComplexNumber(2,2);
		assertNotEquals(a,b);	
	}

	@Test
	public void two_complex_numbers_are_not_equal_if_they_have_different_imaginary_values(){
		ComplexNumber a = new ComplexNumber(2,1);
		ComplexNumber b = new ComplexNumber(2,2);
		assertNotEquals(a,b);	
	}

	@Test
	public void a_complex_numbers_is_not_equal_to_some_other_object_type(){
		ComplexNumber a = new ComplexNumber(1,2);
		String b = "Baaageeecha";
		assertNotEquals(a,b);	
	}

	@Test
	public void adding_two_numbers_adds_real_and_imaginary_parts_separately(){
		ComplexNumber a = new ComplexNumber(1,2);
		ComplexNumber b = new ComplexNumber(2,3);
		ComplexNumber c = new ComplexNumber(3,5);
		assertEquals(c,a.add(b));
	}

	@Test
	public void subtracting_two_numbers_subtracts_real_and_imaginary_parts_separately(){
		ComplexNumber a = new ComplexNumber(1,-2);
		ComplexNumber b = new ComplexNumber(2,-3);
		ComplexNumber c = new ComplexNumber(-1,1);
		assertEquals(c,a.subtract(b));
	}
}