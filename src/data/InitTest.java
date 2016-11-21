package data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InitTest {
	private Student student;
	
	@Before
    public void init() {
		student = new Student("Hans", "Wurst", 555568, Courses.AI);
	}
	
	@Test
	public void test_initializer() {	
		assertEquals("fornames are not equal", "Hans", student.getForname());
		assertEquals("surnames are not equal", "Wurst", student.getSurname());
		assertEquals("Ids are not equal", 555568, student.getId());
		assertEquals("Courses are not equal", Courses.AI, student.getCourse());
	}
}
