package constructorarea;

public class JavaBean implements java.io.Serializable {
	private int id;
	private String name;

	public JavaBean() 
	    { 
	    }

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

	}

}
