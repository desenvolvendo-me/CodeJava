public class Factorial {

  public void factorial(int number) {
    int i, fact = 1;

    for (i = 1; i <= number; i++) {
      fact = fact * i;
    }

    System.out.println(fact);
  }

}