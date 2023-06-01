package entity;

public class Department {
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	private int id;
	private String name;
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
