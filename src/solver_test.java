
public class solver_test {
	public static void main (String []args){
		invertible_float a = new invertible_float();
		invertible_float b = new invertible_float();

		solver test = new solver(a,b);
		test.set_A();
		test.set_B();
		test.solve_for_x().display("b/a");
		
	}
}
