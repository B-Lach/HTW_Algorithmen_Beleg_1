package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class InitTest {

	@Test
	public void test_initializer() {
		Student student = new Student("Hans", "Wurst", 555568, Courses.AI);
		assertEquals("Hans", student.getForname());
		assertEquals("Wurst", student.getSurname());
		assertEquals(555568, student.getId());
		assertEquals(Courses.AI, student.getCourse());
				
	}

}
