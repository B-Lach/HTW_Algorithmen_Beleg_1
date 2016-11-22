package data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedStudentListTest {
	private SinglyLinkedStudentList<Student> list;
	private Student first;
	@Before
	public void setUp() throws Exception {
		first = new Student("Hans", "Wurst", 345422, Courses.BWL);
		
		list = new SinglyLinkedStudentList();
		list,addFirst(first)
	}
	// Thinks to test
	
	// add object first √
	// add object last √
	// add object at index √
	// add object at index < 0 what should happen? At object first I guess √
	// add object at index > list.count() √

	// initial count √
	// count after adding some objects
	// count after removing an object
	// count after removing all objects
	
	// get object at invalid index
	// get object at valid index
	
	// 
	
	
	@Test
	public void test_initialCount() {
		int count = list.count();
		assertEquals("The objcet count does not equals to 1", 1, count);
	}
	
	@Test
	public void test_getObjectValidIndex() {
		Student valid = list.get(0);
		
		assertEquals("The objects should be equal", first, valid);
	}
	@Test
	public void test_getObjectInvalidIndex() {
		Student invalid = list.get(-1);
		
		assertNull("The returned object should be null", invalid);
	}
	
	@Test
	public void test_addObjectFirst() {
		Student temp = new Student("Max", "Mustermann", 000000, Courses.AI);
		list.addFirst(temp);
		
		assertEquals("Students should be equal", temp, list.getFirst());
	}
	
	@Test
	public void test_addObjectLast() {
		Student temp = new Student("Foo", "Bar", 111111, Courses.BWL);
		list.addLast(temp);
		
		assertEquals("Students should be equal", temp, list.getLast());
	}
	
	@Test
	public void test_addObjectAtValidIndex() {
		Student temp = new Student("Index", "Test", 222222, Courses.ET);
		list.add(temp, 1);
		assertEquals("Object at the index is not correct", temp, list.get(1));
	}
	
	@Test
	public void test_addObjectAtNegativeIndex() {
		Student temp = new Student("Index", "Negative", 333333, Courses.BWL);
		list.add(temp, -1);
		assertEquals("Object added at a negative index is not set as the first object", temp, list.getFirst());
	}
	
	@Test
	public void test_addObjectAtIndexBiggerCount() {
		Student temp = new Student("Index", "BiggerCount", 444444, Courses.BWL);
		list.add(temp, 100);
		
		assertEquals("Object should be the last object", temp, list.getLast());
	}
	
	@Test
	public void test_countAfterAddingObjects() {
		
	}

}
