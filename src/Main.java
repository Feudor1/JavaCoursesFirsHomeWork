import java.io.Console;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        String order;
        Console con = System.console();
        order = con.readLine("What do you what? * Enter the calc or calculator for... you know what ");
        if (order.equalsIgnoreCase("calculator") || order.equalsIgnoreCase("Calc"))
            {
                calc();
            }
        else {
            System.out.println("Go and do" + order + " yourself");
        }

    }

        public static void calc()
        {
            Scanner scanner = new Scanner(System.in);
            char operation;
            double firstOperand;
            double secondOpreand;
            double result;
            System.out.println("Enter the first number");
            if (!scanner.hasNextDouble()) {
                System.out.println("You've entered the wrong number");
                scanner.close();
                System.exit(1);
            }
            firstOperand = scanner.nextDouble();

            System.out.println("Enter the operation: + - / *");
            operation = scanner.next().charAt(0);
            System.out.println("Enter the second number");
            if (!scanner.hasNextDouble()) {
                System.out.println("You've entered the wrong number");
                scanner.close();
                System.exit(1);
            }
            secondOpreand = scanner.nextDouble();

            if (operation == '+')
            {
                result = firstOperand + secondOpreand;
                System.out.println("You entered the first number = " +firstOperand);
                System.out.println("You entered the second number = " +secondOpreand);
                System.out.println("You have chosen addition");
                System.out.println("The result is " +result);
            }

            if (operation == '-')
            {
                result = firstOperand - secondOpreand;
                System.out.println("You entered the first number = " +firstOperand);
                System.out.println("You entered the second number = " +secondOpreand);
                System.out.println("You have chosen subtraction");
                System.out.println("The result is " +result);
            }

            if (operation == '*')
            {
                result = firstOperand * secondOpreand;
                System.out.println("You entered the first number = " +firstOperand);
                System.out.println("You entered the second number = " +secondOpreand);
                System.out.println("You have chosen multiplication");
                System.out.println("The result is " +result);
            }

            if (operation == '/' && secondOpreand != 0) {
                result = firstOperand / secondOpreand;
                System.out.println("You entered the first number = " +firstOperand);
                System.out.println("You entered the second number = " +secondOpreand);
                System.out.println("You have chosen multiplication");
                System.out.println("The result is " +result);
            }
            if (operation == '/' && secondOpreand == 0)
            {
                System.out.println("You can't divide by zero: " + firstOperand + " " + operation + " " + secondOpreand);
            }

        }
}