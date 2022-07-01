import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    int operator;
    int number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

  

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextInt();

    System.out.println("Enter second number");
    number2 = input.nextInt();

    operator = input.nextInt();

    System.out.println("1. Addition");
System.out.println("2. Substraction");
System.out.println("3.Multiplication ");
System.out.println("4. Division");
    switch (operator) {

      // performs addition between numbers
      case 1:
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
  break;

      // performs subtraction between numbers
      case 2:
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
  break;

      // performs multiplication between numbers
      case 3:
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
       break;

      // performs division between numbers
      case 4:
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}