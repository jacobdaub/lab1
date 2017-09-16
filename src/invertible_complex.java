
import java.util.Random;
import java.lang.*;
import java.util.Scanner;

public class invertible_complex implements invertible {
	float real; //complex number is made of a + bi. where a and b are real numbers and i is the imaginary unit
	float ima; // imaginary coefficient.
	static Random rand; 
	
	public invertible_complex (){
		real = 0;
		ima = 0;
		if (rand==null) rand = new Random();
	}
	
	  public void init(){
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter the real number: ");
		  this.real = scan.nextFloat();
		  System.out.print("Enter the i coefficient : ");
		  this.ima = scan.nextFloat();
	  }
	  public void randomize(){
		  real = rand.nextInt(100); 
		  ima = rand.nextInt(100); 
	  }
	  public void reset_2_zero(){
		  real = 0;
		  ima = 0;
	  }
	  public void reset_2_identity(){
		  real = 1;
		  ima = 0;
	  }
	  public invertible get_inverse() throws ArithmeticException{
		  if (real ==0 && ima ==0){
			  throw new ArithmeticException();
		  }
		  
	  }
	  public invertible multiply_by(invertible val){
		  
	  }
	  public void display(String  name){
		  
	  }

}
