package tr.org.linux.kamp.ex;

public class Students {
	private String name;
	private int id;
	
	public Students(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}
