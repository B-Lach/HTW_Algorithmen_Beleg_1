package lists;
import data.Courses;

public interface ListInterface<T> {
	
	public void addFirst(T obj);
	
	public void addLast(T obj);
	
	public void add(T obj, int index);
	
	public T get(int index);
	
	public T[] getAll();
	
	public int count();
	
	public void delete(int index);
	
	public void deleteAll();
	
	public void find(String forname, String surname, int id, Courses course);
	
	public void sortUsingBubble();
	
	// public void sortUsing select another sort algorithm 
}
