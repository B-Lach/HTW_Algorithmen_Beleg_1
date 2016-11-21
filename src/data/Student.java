package data;

public class Student {
	private String forname;
	private String surname;
	private int id;
	private Courses course;
	
	Student(String forname, String surname, int id, Courses course) {
		this.forname = forname;
		this.surname = surname;
		this.id = id;
		this.course = course;
	}

	public String getForname() {
		return forname;
	}

	public String getSurname() {
		return surname;
	}

	public int getId() {
		return id;
	}

	public Courses getCourse() {
		return course;
	}
	
}
