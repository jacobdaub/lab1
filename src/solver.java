
import java.util.Scanner;

public class solver{
	private invertible a;
	private invertible b;
	
	solver (invertible passedA, invertible passedB){
		a = passedA;
		b = passedB;
	}

	public void set_A(){
		a.init();
	}
	public void set_B(){
		b.init();
	}
	public invertible solve_for_x(){
		return b.multiply_by(a.get_inverse());
	}
	
}
