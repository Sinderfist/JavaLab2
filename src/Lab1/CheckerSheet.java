package Lab1;

public class CheckerSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		QUESTION 2
		
//		Use the constructor for students and declare a new student
		Student todd = new Student();
		Student mario = new Student();
		
//		fill in the parameters for the variables that were made in the student class sheet
		todd.firstName = "Todd";
		todd.lastName = "Hopkins";
		todd.setEmail("Thop@gmail.org");
		todd.setPhoneNumber(1234567890);
		todd.setSID(0001);
		
		mario.firstName = "Mario";
		mario.lastName = "Wells";
		mario.setEmail("Wario@gmail.org");
		mario.setPhoneNumber(1234567891);
		mario.setSID(0002);
		
		
//		print out each variable
		System.out.println("//////////// Question 2 Answers Start Here //////////////////////////");
		System.out.println(todd.firstName);
		System.out.println(todd.lastName);
		System.out.println(todd.getEmail());
		System.out.println(todd.getPhoneNumber());
		System.out.println(todd.getSID());
		
		
		System.out.println(mario.firstName);
		System.out.println(mario.lastName);
		System.out.println(mario.getEmail());
		System.out.println(mario.getPhoneNumber());
		System.out.println(mario.getSID());
		System.out.println("//////////// Question 2 Answers End Here //////////////////////////");
		
		
		
		System.out.println("//////////// Question 3 Answers Start Here //////////////////////////");
		Bike bike = new Bike();
		System.out.println("For Bikes there are " + bike.numOfTires() + " numbers of tires that need a tire type of " + bike.tireType() );
//		System.out.println(bike.numOfTires());
//		System.out.println(bike.tireType());
//		System.out.println(bike.getBikeInfo());
		
		Truck truck = new Truck();
		System.out.println("For Bikes there are " + truck.numOfTires() + " numbers of tires that need a tire type of " + truck.tireType() );
//		System.out.println(truck.numOfTires());
//		System.out.println(truck.tireType());
//		System.out.println(truck.getTruckInfo());
		System.out.println("//////////// Question 3 Answers End Here //////////////////////////");

		System.out.println("//////////// Question 4 Answers Start Here //////////////////////////");
		
		Employee Robert = new Employee();
		Employee Sam = new Employee();
		Employee John = new Employee();
		
		Robert.name("Robert");
		Robert.year(1994);
		Robert.salary(45000);
		Robert.address("64C- WallsStreat");
		
		Sam.name("Robert");
		Sam.year(2000);
		Sam.salary(50000);
		Sam.address("68D- WallsStreat");
		
		John.name("John");
		John.year(1999);
		John.salary(55000);
		John.address("26B- WallsStreat");
		
		System.out.println("//////////// Question 4 Answers End Here //////////////////////////");
	}
	
	
	

}
