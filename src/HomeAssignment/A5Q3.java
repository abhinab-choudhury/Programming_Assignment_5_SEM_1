package HomeAssignment;

import java.util.Scanner;

public class A5Q3 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the value of X: ");
    double X = obj.nextDouble();

    double sum = 0;
    double k = 1, sign = -1;
    int term = 10;
    do{
      long factorial = 1;
      for(int i = 1;i <= k;i++) {
        factorial *= i;
      }
      sign *= -1;
      sum += sign*(Math.pow(X,k)/factorial);
      k += 2;
      System.out.println("sign : " + sign +"\nfactorial : " + factorial + "\nsum : " + sum);
    }while(term-- > 0);
    System.out.println("sin (x) = (x)- (x^3)/3! + (x^5)/5! + .... + ");
    System.out.println("sin(" + X +  ") : " + sum);

    obj.close();
  }
}
