import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class select {
	

	public static void select_menu() {
		String x;
		
		System.out.println("Choose an item number: \n" + "1- Update a student..\n"+"2- Return back to main menu\n");
		Scanner sc1 = new Scanner(System.in);
		x=sc1.nextLine();
	
		if (x.equals("1") ) {
		try {
			selectID();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if (x.equals("2") ) {
			try {
				Ezgin_mert_mehmet.main_menu();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		}
		

	
	public static void selectID() throws FileNotFoundException {
		String id;
		Scanner sc1 = new Scanner(System.in);
		File f1 = new File("StudentInformations.txt");
		Scanner sc2 = new Scanner(f1);
		String x;
		
		System.out.println("Please enter StudentID for show student.");
		id = sc1.next();
		
		while(sc2.hasNext()){
			
			x = sc2.nextLine();
			
			if(x.contains(id)){
				
				System.out.println(x);
			}
		}
		sc2.close();
		 select_menu();
		
	}
	
	
	
	

}
