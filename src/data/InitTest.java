package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class InitTest {

	@Test
	public void test_initializer() {
		Student student = new Student("Hans", "Wurst", 555568, Courses.AI);
		assert("Hans",student.firstname);
		assert("Wurst", student.surname);
		assert(555568, student.id);
		assert(Courses.AI, student.course);
				
	}

}
