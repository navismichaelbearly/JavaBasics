package n2s.ehc.navis;

import java.util.Scanner;

public class UserMain {
	public static Scanner scn;
	public UserBean ub = new UserBean();
	public static boolean done = false;
	public static void main(String[] args) {
		inputMain();
	}
	
	private static void inputMain() {
		scn = new Scanner(System.in);
		while (!done) {
			System.out.println("Choose the below option");
			System.out.println("1 - Insert");
			System.out.println("2 - Update");
			System.out.println("3 - Delete");
			System.out.println("4 - View");
			System.out.println("5 - Exit");
		     if(scn.hasNextInt()) {
		    	 try {
						inputEntry(scn.nextInt());
					} catch (InvalidEntry e) {
						System.out.println(e.getMessage());
					}
		     }
		     else {
		    	 System.out.println("please enter an integer value");
		    	 inputMain();
		     }
		}
		
	}

	public static void inputEntry(int scanInput) throws InvalidEntry {
		UserBean ub = new UserBean();
		
		
		switch(scanInput) {
			case 1:
				ub.setOptionValue(1);
				System.out.println("Option 1 is selected");
				done = true;
			break;
			case 2:
				ub.setOptionValue(2);
				System.out.println("Option 2 is selected");
				done = true;
			break;
			case 3:
				ub.setOptionValue(3);
				System.out.println("Option 3 is selected");
				done = true;
			break;
			case 4:
				ub.setOptionValue(4);
				System.out.println("Option 4 is selected");
				done = true;
			break;
			case 5:
				ub.setOptionValue(5);
				scn.close();
				System.out.println("Execution is done");
				done = true;
				System.exit(0);
				
			break;
			default:
				throw new InvalidEntry("Invalid Option Selected");
		}
	}

}
