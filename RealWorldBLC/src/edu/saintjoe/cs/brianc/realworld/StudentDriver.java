package edu.saintjoe.cs.brianc.realworld;

public class StudentDriver {

	public static void main(String[] args) {
		// See what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		
		Student nextStudent = new Student("Jared Alt", "M", 1, 19);
		cmp112.setStudent(nextStudent, studentCount++);
		// cmp112.students[studentCount++] = nextStudent;
		nextStudent = new Student("Jude Brace", "M", 2, 20);
		// cmp112.students[studentCount++] = nextStudent;
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Zach Bobos", "M", 1, 19);
		// cmp112.students[studentCount++] = nextStudent;
		cmp112.setStudent(nextStudent, studentCount++);
		System.out.println(cmp112.toString());
		

	}

}
