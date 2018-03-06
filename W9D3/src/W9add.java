import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 
 * version 1 @author SahasKiran 
 * program implemented on 06-March-2018
 *
 */
public class W9add {

public static void main(String args[]) {
	System.out.println("Sum & Difference  Between error terms this program was implemented by the Sahas Kiran");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Fisrt enter the measuredvalue of 1st term");
	double MeasuredValue1 = keyboard.nextDouble();                        // this was print on the console here we can enter 1st measuredvalue 
	System.out.println("Now enter the Error term of the 1st term");
	double ErrorValue1 = keyboard.nextDouble();                           // this was print on the console here we can enter 1st Errorvalue 
	System.out.println("");
	System.out.println("Fisrt enter the measuredvalue of 2nd term");
	double MeasuredValue2 = keyboard.nextDouble();                        // this was print on the console here we can enter 2nd measuredvalue 
	System.out.println("Now enter the Error term of the 2nd term");
	double ErrorValue2 = keyboard.nextDouble();                          // this was print on the console here we can enter 2nd Errorvalue 
	System.out.println("");
	keyboard.close();
	
	DecimalFormat kwbd = new DecimalFormat();
	
	
	// here below the sum the given inputs along with error terms was performed 
	System.out.println("");
    System.out.println("Sum of the both inputs");
    double SumMeasured=MeasuredValue1+MeasuredValue2;
    double Sumerror=ErrorValue1+ErrorValue2;
    System.out.println(SumMeasured + "±" + Sumerror);    // here the output was  after addition of the two input terms
    System.out.println("Round up value After Addition");
    System.out.println(kwbd.format(SumMeasured) + "±" +kwbd.format(Sumerror));
    System.out.println("");
    
 // here below the difference between the given inputs along with error terms was performed 
    System.out.println("Differnce between the both inputs");
    double DifferenceMeasured=MeasuredValue1-MeasuredValue2;
    double DifferenceError=ErrorValue1+ErrorValue2;
    System.out.println(DifferenceMeasured + "±" +DifferenceError);
    System.out.println("Round up value after subtraction");
    System.out.println(kwbd.format(DifferenceMeasured) + "±" +kwbd.format(DifferenceError));
    System.out.println("");
    
	
}
}
