package w14;

public class Main {

	public static void main(String[] args) {
		Bike newBike = new Bike();
		
		newBike.braking();
		newBike.gear = 0;
		
		Student s1 = new Student();
		
		s1.setName("Mervan");
		System.out.println(s1.getName());
		s1.setId(1);
		System.out.println(s1.getId());
		
		
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		
		s2.insertRecor(111, "Ali");
		s3.insertRecor(222, "Can");
		s2.displayInformation();
		s3.displayInformation();
		
		
	}

}
