import java.util.Scanner;

public class CalculaterV2 {
	
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay;
	
	
	//Modulle 1: welcome 
	
	public static void wellcome() {
		System.out.println("welcome to EMP cal- please folow the instruction");
		System.out.println();
		System.out.println();
		
	}
	//Module 2 : input 
   
	public static void getInput() {
		
		Scanner Hr = new Scanner(System.in) ;
		System.out.println("enter employee name ");
		nameOfEmployee = Hr.nextLine();
		
		System.out.println("enter employee total Hours ");
		numberOfHourWorked = Hr.nextDouble();
		
		System.out.println("enter Hourly pay Rte");
		hourlyPayRate = Hr.nextDouble();
		
		
	
		
		
	}
	//module 3: grosspay 
	public static void calculatGrossPay() {
		
		grossPay=numberOfHourWorked*hourlyPayRate ;
	}
	
	//module 3 : display 
	public static void displayOUTput() {
		
		
	System.out.println();
	System.out.println("=============================");
	System.out.println("EMPLOYEES Name ");
	System.out.println("EMPLYEES TOTAL IS: "+numberOfHourWorked);
	System.out.println("“ Payment Rate Of employee  " +hourlyPayRate);
	System.out.println("The total Payment for Employee is " +  grossPay);
	System.out.println("==========================");
}


   //Module 4:exitprogrma 
	public static void exit() {
		System.out.println("have a nice day ");
		
	}
	public static void main(String[] args) {
		
		
			
		wellcome();
		getInput();
		calculatGrossPay();
		displayOUTput() ;
		exit();
		
		
		
		
		
		

		
		
		
			

	}

}
 