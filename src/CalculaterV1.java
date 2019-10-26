import java.util.Scanner;

public class CalculaterV1 {

	public static void main(String[] args) {
		
		//declare
		String nameOfEmployee;
		double numberOfHourWorked;
		double hourlyPayRate;
		double grossPay;
		System.out.println("welcome to EMP cal- please folow the instruction");
		System.out.println();
		System.out.println();
	
		Scanner Hr = new Scanner(System.in) ;
		System.out.println("enter employee name ");
		nameOfEmployee = Hr.nextLine();
		
		System.out.println("enter employee total Hours ");
		numberOfHourWorked = Hr.nextDouble();
		
		System.out.println("enter Hourly pay Rte");
		hourlyPayRate = Hr.nextDouble();
		
				
				//intialisation 
		//nameOfEmployee = "jhon";
	//	numberOfHourWorked = 40;
		//hourlyPayRate = 15;/*
		
		// process
		grossPay=numberOfHourWorked*hourlyPayRate ;
		 
		
		
		// DISPALY OUT PUT 
		
		
		System.out.println("EMPLOYEES Name ");
		System.out.println("EMPLYEES TOTAL IS: "+numberOfHourWorked);
		System.out.println("“ Payment Rate Of employee  " +hourlyPayRate);
		System.out.println("==========================");
		System.out.println("The total Payment for Employee is " +  grossPay);
		
		
		

		
		
		
			

	}

}
