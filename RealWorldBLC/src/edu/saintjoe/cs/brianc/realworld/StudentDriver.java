package edu.saintjoe.cs.brianc.realworld;

public class StudentDriver {

	public static void main(String[] args) {
		// See what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		Course cmp113= new Course("CMP113", "Core 115");
		
		Student nextStudent = new Student("Jared Alt", "M", 1, 19);
		// To put data into our private array, we had to write a mutator
		//  We pass it a filled-in Student record, and our "counter" which is studentCount
		cmp112.setStudent(nextStudent, (studentCount++));
		// cmp112.students[studentCount++] = nextStudent;
		nextStudent = new Student("Jude Brace", "M", 2, 20);
		// cmp112.students[studentCount++] = nextStudent;
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Zach Bobos", "X", 1, 19);
		// cmp112.students[studentCount++] = nextStudent;
		cmp112.setStudent(nextStudent, studentCount++);
		// Add YOURSELF!!!
		nextStudent = new Student("Ryan Postma", "M", 3, 20);
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Chandler Gull", "M", 1, 19);
		cmp112.setStudent(nextStudent, studentCount++);
		System.out.println(cmp112.toString()); 

	}

}
