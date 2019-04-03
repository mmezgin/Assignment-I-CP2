import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Show_all {
	public static void show() throws IOException {
		 FileReader fr = null;
			try {
				fr = new FileReader("StudentInformations.txt");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} 
		      char [] a = new char[9999];
		      fr.read(a);  
		      
		      for(char c : a)
		         System.out.print(c);   
		      fr.close();
	}
	
	
	
	
	public static void ShowAll() throws IOException {
		String x;
 FileReader fr = null;
			try {
				fr = new FileReader("StudentInformations.txt");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} 
		      char [] a = new char[9999];
		      fr.read(a);  
		      
		      for(char c : a)
		         System.out.print(c);   
		      fr.close();
		  	System.out.println("\n \n");
		  	System.out.println("Press any key and enter to go back to main menu.");
		  	Scanner sc1 = new Scanner(System.in);
			x=sc1.nextLine();
	
	
		Ezgin_mert_mehmet.main_menu();
	
	
}
}
