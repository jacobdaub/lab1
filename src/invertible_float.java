import java.util.Random;
import java.lang.*;
import java.util.Scanner;


public class invertible_float implements invertible{
    float val;
    static Random rand;
    
    public invertible_float () { val = 0; if (rand==null) rand = new Random();}
    public void randomize() { val = rand.nextInt(100); }
    public void reset_2_zero() { val = 0; }
    public void reset_2_identity() { val = 1; }
    public void init (){
    	Scanner scan = new Scanner(System.in);
    	System.out.print("enter a float number: ");
    	this.val = scan.nextFloat();
    	
    }
    
    public invertible get_inverse() throws ArithmeticException { 
      if (val == 0) {
        throw new ArithmeticException();
      }
      else {
        invertible_float B = new invertible_float();
        B.val = 1/val;
        return B;
      }
    }
    public invertible multiply_by(invertible B){
      invertible_float C = new invertible_float();
      invertible_float b = (invertible_float)B;
      C.val = val * b.val;
      return C;
    }
  public void display(String  name){
      System.out.println("invertible_float '" + name + "': " + val);
  }
  public static void main (String []args){
	  invertible_float test = new invertible_float();
	  invertible_float big = new invertible_float();
	  big.init();
	  test.init();
	  test = (invertible_float) test.multiply_by(big);
	  test.display("");
	  
  }
}