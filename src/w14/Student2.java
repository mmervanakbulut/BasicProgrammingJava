package w14;

public class Student2 {
	int id;
	String name;
	
	
	void insertRecor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void displayInformation() {
		System.out.println(id + " " + name);
	}

	
}
