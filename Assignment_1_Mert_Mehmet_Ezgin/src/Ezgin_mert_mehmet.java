import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ezgin_mert_mehmet {
	
	public static class Student {
		private String name;
		private String surname;
		private String number;
		private double grade1;
		private double grade2;
		private double grade3;
		private double grade4;
		private double grade5;
		private double gpa;
		
		public void setName(String name) {
			this.name=name;
			
		}
		public String getName() {
			return this.name;
		}

		public void setSurname(String surname) {
			this.surname=surname;
			
		}
		public String getSurname() {
			return this.surname;
		}

		public void setNumber(String number) {
			this.number=number;
			
		}
		public String getNumber() {
			return this.number;
		}

		public void setGrade1(double grade1) {
			this.grade1=grade1;
			
		}
		public double getGrade1() {
			return this.grade1;
		}
		
		public void setGrade2(double grade2) {
			this.grade2=grade2;
			
		}
		public double getGrade2() {
			return this.grade2;
		}
		
		public void setGrade3(double grade3) {
			this.grade3=grade3;
			
		}
		public double getGrade3() {
			return this.grade3;
		}
		
		public void setGrade4(double grade4) {
			this.grade4=grade4;
			
		}
		public double getGrade4() {
			return this.grade4;
		}
		
		public void setGrade5(double grade5) {
			this.grade5=grade5;
			
		}
		public double getGrade5() {
			return this.grade5;
		}
		
		public void setGPA(double gpa) {
			this.gpa=gpa;
			
		}
		public double getGPA() {
			gpa = (grade1+grade2+grade3+grade4+grade5)/5;
			return this.gpa;
		}
	
		
	}
	

	public static void main_menu () throws IOException {
		String x;
		System.out.println("Choose an item number: \n" + "1- Add student.\n2- Show student information.\n"+"3- Show all student informations. \n"
		+"4- Update student information.\n"+"5- Delete student information.\n"+"6- Show GPA.\n"+
	
		
		"7- Show the  average GPA.\n"+"8- Exit menu item.\n");
		Scanner sc1 = new Scanner(System.in);
		x=sc1.nextLine();
		if(x.equals("1")) {
			String z;
	        Scanner z1 = new Scanner(System.in);
			int n_Student;
			Scanner sc3 = new Scanner(System.in);
		
			System.out.println("Enter the number of students will be added.");
			n_Student = sc3.nextInt();
			
			addStudent(n_Student);
			System.out.println("Press any key and enter to go back to main menu");
			z=z1.nextLine();
			main_menu ();
			
			
		}
		else if (x.equals("2") ) {
			
			
	}
		else if  (x.equals("3")) {
			Show_all.ShowAll();
		}
		else if (x.equals("4")) {
			Update_Student_Information.update_menu();
		}
		else if (x.equals("5")) {
			 
		}
		else if (x.equals("6")) {
			
		}
		else if (x.equals("7")) {
			
		}
		else if (x.equals("8"))
		{
			Exit_Menu.exit();
		}
		else {
			System.out.println(" Error !!! Invalid choose. Please choose between 1-8 integer selection !!! ");
			main_menu();
		}
	}
	
	
	public static void addStudent(int n_Student) throws FileNotFoundException {
		
		String name;
		String surname;
		String stdId;
		double grade1;
		double grade2;
		double grade3;
		double grade4;
		double grade5;
		Scanner keyboard = new Scanner(System.in);
		File f1 = new File("StudentInformations.txt");
		PrintWriter printFile = new PrintWriter("StudentInformations.txt");
		Student st = new Student();
		
		for(int i = 0; i < n_Student; i++) {
		
		System.out.println("Please enter the student name:\n");
		name = keyboard.next();
		st.setName(name);
		
		System.out.println("Please enter the student surname:\n");
		surname = keyboard.next();
		st.setSurname(surname);
		
		System.out.println("Please enter the student number:\n");
		stdId = keyboard.next();
		st.setNumber(stdId);
		
		System.out.println("Please enter the grade #1\n");
		grade1 = keyboard.nextDouble();
		st.setGrade1(grade1);
		
		System.out.println("Please enter the grade #2\n");
		grade2 = keyboard.nextDouble();
		st.setGrade2(grade2);
		
		System.out.println("Please enter the grade #3\n");
		grade3 = keyboard.nextDouble();
		st.setGrade3(grade3);
		
		System.out.println("Please enter the grade #4\n");
		grade4 = keyboard.nextDouble();
		st.setGrade4(grade4);
		
		System.out.println("Please enter the grade #5\n");
		grade5 = keyboard.nextDouble();
		st.setGrade5(grade5);
		
		printFile.println("Name: " + st.getName() + " Surname: " + st.getSurname() + " StdId: " + 
		st.getNumber() + " Grade1: " + st.getGrade1() + " Grade2: " + st.getGrade2() + " Grade3: " +
				st.getGrade3() + " Grade4: " + st.getGrade4() + " Grade5: " + st.getGrade5() + " GPA: " +
		st.getGPA());
		
		}
		printFile.close();
		
	}
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		main_menu();
		
		//Student[] arrayST;
		
		
	}
	


}
