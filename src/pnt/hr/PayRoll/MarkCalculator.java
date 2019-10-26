package pnt.hr.PayRoll;

import pnt.hr.calculator.CalculaterV5;

public class MarkCalculator {

	public static void main(String[] args) {
		
		CalculaterV5  MarkCalculator = new CalculaterV5 ();
		MarkCalculator.wellcome();
		
	
		
		for( int i = 0 ; i<=3;i++) {
			System.out.println("Employee payroll"+(i+1));
			MarkCalculator.getInput();
		    MarkCalculator.CalculateSalary();
			MarkCalculator.displayOUTput();
			
			if (!MarkCalculator.doYouwantToContinueTheProgram()){
				break;
				
			}
			
			

	
		}
		MarkCalculator.exit();
		
		
	

	
	}

}
