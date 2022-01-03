package ict2;

public class Test {
	public static void main(String[] args) {
		// declare, create and initialise an array of Person objects
		// When you have implemented Manager and Employee, you should be able
		// to uncomment the commented code below.
		Person[] people =
			{
			  	new Manager("C. Darwin", 455, "c.darwin@species.com", 1000000, 40000, "Room 101"),
				new Person("J. Doe", 200, "j.doe@supermail.com"),
				new Student("A. Bee", 120, "a.bee@bettermail.com", "19000091"),
				new Employee("B. Cee", 111, "b.cee@okmail.com", 1000000),
				new Student(),
				new Employee(),
			  	new Manager("A. Einstein", 105, "a.einstein@emc2.com", 2000000, 500000,  "Room 202"),
				new Manager()
			};
		
		// display the objects
		display(people);
		
		// display student numbers
		displayNumbers(people);
		

	}
	// displays each object in the array
	public static void display(Person[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i].toString());
	}

	// Your displayNumbers method should go here.
	public static void displayNumbers(Person[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] instanceof Student)
			{
				var stud = (Student) arr[i];
				System.out.println("The " + (i + 1) + "th person is a student with number " + stud.getNumber() +  "\n" );

			}
	}

}
