package collection;

public class StudentEntity {

	private int id;
	private String name;
	private String surName;
	private double marks;

	public StudentEntity() {
		super();
		
	}

	public StudentEntity(int id, String name, String surName, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", surName=" + surName + ", marks=" + marks + "]";
	}
}
