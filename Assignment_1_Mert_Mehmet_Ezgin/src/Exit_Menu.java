import java.io.IOException;
import java.util.Scanner;

public class Exit_Menu {
public static void exit () throws IOException {
	String x;
	System.out.println("Are you sure to exit the program ? (Y/N \n"); 
	Scanner sc3 = new Scanner(System.in);
	x= sc3.nextLine();
	if (x.equals("Y")   || x.equals("y")) {
		//
		System.out.println("Program succesfully closed !");
		System.exit(0);
}
	else if  (x.equals("N")   || x.equals("n")) {
		Ezgin_mert_mehmet.main_menu();
	}
	
	
	
	
	
	
}
}
