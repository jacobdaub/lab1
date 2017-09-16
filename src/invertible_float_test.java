public class invertible_float_test {
    public static void main(String args[]) {
      invertible_float A = new invertible_float();
      A.randomize();
      A.display("A");
      invertible_float B = new invertible_float();
      B.randomize();
      B.display("B");
      invertible_float C = (invertible_float) A.get_inverse();
      C.display("C");
      invertible_float D = (invertible_float) B.multiply_by(C);
      D.display("B/A");
      invertible_float E = new invertible_float();
      E.reset_2_zero();
      try {
        invertible_float F = (invertible_float) E.get_inverse();
        F.display("divideByZero");
      } catch (Exception e) {
          System.out.println("divideByZero");
      }
      System.out.println("done!");
    }
}