import java.util.Scanner;

public class CalculaterV4 {
	
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay;
	static double netpay;
	
	
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
	System.out.println("The employee grossPay is " +  grossPay);
	System.out.println("the employee netPay is  " +netpay);
	System.out.println("==========================");
}

	
	 //module 4: net pay 
	public static void calculatNetpay() {
		if (grossPay<0 && grossPay<=1500) {
			netpay=grossPay-(grossPay*15)/100;
			
			
		}else if (grossPay>=1500 && grossPay<=3000) {
			netpay= grossPay-(grossPay*19)/100;
		}else if (grossPay>3000 && grossPay<=4500) {
			netpay = grossPay-(grossPay*21)/100;
			
		}else if (grossPay>=4500 && grossPay<=6000) {
			netpay = grossPay-(grossPay*23)/100;
			
	
		}else if (grossPay>6000) {
			netpay = grossPay-(grossPay*27)/100;
			
			
				
			
		}else { netpay=0;
			System.out.println("invalid input warning ");
			
		}
			
		
	}

   //Module 4:exitprogrma 
	public static void exit() {
		System.out.println("have a nice day ");
		
	}
	public static void main(String[] args) {
		
		
			
		wellcome();
		
		for( int i = 0 ; i<=3;i++) {
			System.out.println("Employee payroll"+(i+1));
		
			
				getInput();
			calculatGrossPay();
			calculatNetpay();
			displayOUTput() ;
			
			
			
			String doYouwantToContinueTheProgram;
			
			Scanner MyScanner =new Scanner (System.in);
			System.out.println("do you want to continue ");
			
			doYouwantToContinueTheProgram=MyScanner.nextLine();
			
			
			if (doYouwantToContinueTheProgram.equals("no")) {
				break;
				
			}
			
			
			

	
		}



		
		
		exit();
		
		
		
		
		
		

		
		
		
			

	}

}
 