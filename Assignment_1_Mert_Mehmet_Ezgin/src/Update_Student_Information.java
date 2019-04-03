import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Update_Student_Information  {
	
	public static void update_menu() throws IOException {
		String x,y,z,line;
		File f1 = new File("StudentInformations.txt");
		System.out.println("Choose an item number: \n" + "1- Update a student..\n"+"2- Return back to main menu\n");
		Scanner sc1 = new Scanner(System.in);
		x=sc1.nextLine();
		if (x.equals("1") ) {

		     Show_all.show();
		     
		  /*   System.out.println("\n\nEnter a student number you want to update grades.");
		     Scanner sc2= new Scanner(System.in);*/
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     Scanner kb = new Scanner(System.in);

		     System.out.println(" enter the content you looking for");
		     String name = kb.next();
		     Scanner scanner;
		     try {
		         scanner = new Scanner(f1).useDelimiter( ",");

		         while (scanner.hasNext()) {
		             final String lineFromFile = scanner.nextLine();
		             if (lineFromFile.contains(name)) {
		                 // a match!
		            	 try (BufferedReader br = new BufferedReader(new FileReader("StudentInformations.txt"))) {
		 		    	    
		 		    	    while ((line = br.readLine()) == "*") {
		 		    	       System.out.println(line);
		 		    	    }
		 		    	}
		                 System.out.println("I found " + name);
		                 break;
		             }
		         }
		     } catch (IOException e) {
		         System.out.println(" cannot write to file " +f1.toString());
		     }
			
			
	}
		else if  (x.equals("2")) {
			Ezgin_mert_mehmet.main_menu();
		}
		else {
			System.out.println(" Error !!! Invalid choose. Please choose 1-2 integer selection !!! ");
			update_menu();
		}
	}
}
