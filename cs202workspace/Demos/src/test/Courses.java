package test;

public class Courses {
	private static int count = 0;
	private int id;
	private String name;
	private String type;
	
	public Courses(String name, String type){
//		this.id = id;
		count++;
		this.name = name;
		this.type = type;
		this.id = count;
	}

	public int getCount() {
		return id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
