import java.io.Console;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{
    public static final int coldTemp = -20;
    public static final int warmTemp = -5;

    public static void main(String[] args) {
        //Тут я угорел и решил запилить что-то типа меню в main, а все
        //остальное вывести в отдельные функции. Собсна это оно и есть
        //В процессе запила мне пришла мысль, что не плохо бы это все разнести в классы а в
        //main оставить только вызовы клаасов, но вероятность того, что мне хватит времени крайне мала
        UseProgramPrint();
        String order;
        boolean useTheProgram = useTheProgram();
        while (useTheProgram == true)
        {
            menuOptionsPrint();
            order = menuNavigation();
            if ( order.equalsIgnoreCase("calculator") || order.equalsIgnoreCase("Calc"))
            {
                calc();
            }
            else if ((order.equalsIgnoreCase("rainbow")))
            {
                rainbow();
            }
            else if (order.equalsIgnoreCase("fibonacci"))
            {
                fibonacci();
            }
            else if (order.equalsIgnoreCase("deposit"))
            {
                deposit();
            }
            else if (order.equalsIgnoreCase("SeasonIF"))
            {
               seasonWithIf();
            }
            else if (order.equalsIgnoreCase("SeasonSwc"))
            {
                seasonWithSwitch();
            }
            else if (order.equalsIgnoreCase("temperature")|| order.equalsIgnoreCase("temp"))
            {
                outsideTemperature();
            }
            else if (order.equalsIgnoreCase("cycles"))
            {
                cycles();
            }
            else if (order.equalsIgnoreCase("sum")|| order.equalsIgnoreCase("summ"))
            {
                sumOfNumbers();
            }
            else if (order.equalsIgnoreCase("seq")|| order.equalsIgnoreCase("sequence"))
            {
                sequence();
            }
            else
            {
                System.out.println("Go and do " + order + " yourself");
            }
            
            UseProgramPrint();
            useTheProgram = useTheProgram();
            if (useTheProgram == false)
                break;
        }
    }
    //Метод - калькулятор с 1 задания
        public static void calc()
        {
            Scanner scanner = new Scanner(System.in);
            char operation;
            double firstOperand;
            double secondOpreand;
            double result;


            System.out.println("Enter the first number");
            firstOperand = inputDoubleNumber();
            System.out.println("Enter the second number");
            secondOpreand = inputDoubleNumber();

            System.out.println("Enter the operation: + - / *");
            operation = scanner.next().charAt(0);

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

            if (operation == '/') {
                if (secondOpreand != 0) {
                    result = firstOperand / secondOpreand;
                    System.out.println("You entered the first number = " + firstOperand);
                    System.out.println("You entered the second number = " + secondOpreand);
                    System.out.println("You have chosen division");
                    System.out.println("The result is " + result);
                } else {
                    System.out.println("You can't divide by zero: " + firstOperand + " " + operation + " " + secondOpreand);
                }
            }

        }
    // Функция под калькулятор с 1 задания, проверят что ввели норм число
    public static double inputDoubleNumber()
    {
        double Number;
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextDouble())
        {
            System.out.println("You've entered the wrong number");
            scanner.close();
            System.exit(1);
        }
        Number = scanner.nextDouble();

        return (Number);
    }
    //В процессе запила меню понял, что надо будет часто повторить всякую печать, решил вынести в отдельный метод
    public static String menuNavigation()
    {
        Console con = System.console();
        return (con.readLine());
    }
    public static void menuOptionsPrint() {
        System.out.println("Type the calculator to use the calculator");
        System.out.println("Type the rainbow to find out the name of the colour by its number");
        System.out.println("Type the fibonacci to see the fibonacci sequence");
        System.out.println("Type the deposit to calculate the deposit income");
        System.out.println("Type the Seasonif to find out the time of year by month realised by IF");
        System.out.println("Type the SeasonSwc to find out the time of year by month realised by Switch");
        System.out.println("Type the temperature to find out is it cold outside or not");
        System.out.println("Type the cycles to check 3 and 4 tasks");
        System.out.println("Type the sum to to find out the sum to this number");
        System.out.println("Type the seq to to see the sequence (task number 6)");
    }

    //Тупо метод под работу с прогаммой, надо или нет, вызыам то цикла и после, печать так же вынес отдельно
    //Решил переиспользолвать для опроса пользователя надо ли что-то использовать еще раз
    public static boolean useTheProgram()
    {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextBoolean()) {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
            scanner.next();
        }
        boolean useTheProgram = scanner.nextBoolean();
        return (useTheProgram);
    }

    public static void UseProgramPrint() {
        System.out.println("Type the the true if you want to use the program");
        System.out.println("Type the the false for exit");
    }

    //Да, у меня есть такой же метод на обработку исключений под дабл
    //Сначала я хотел его переиспользовать, но потом подумал что во втором ДЗ много где инт
    //И как бы зачем ОЗУ тратить да и местами это критично по этому так
    public static int inputIntNumber()
    {
        int Number;
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt())
        {
            System.out.println("You've entered the wrong number");
            scanner.close();
            System.exit(1);
        }
        Number = scanner.nextInt();

        return (Number);
    }
    //Метод из второго ДЗ под задачу с радугой
    public static void rainbow()
    {
        int Number;
        while(1>0) {
            System.out.println("Type the number of the colour of the rainbow which you want to know");
            Number = inputIntNumber();
            if (Number == 1) {
                System.out.println("Red");
                break;
            } else if (Number == 2) {
                System.out.println("Orange");
                break;
            } else if (Number == 3) {
                System.out.println("Yellow");
                break;
            } else if (Number == 4) {
                System.out.println("Green");
                break;
            } else if (Number == 5) {
                System.out.println("Blue");
                break;
            } else if (Number == 6) {
                System.out.println("Blue.. I don't know there is no Siniy in the english language");
                break;
            } else if (Number == 7) {
                System.out.println("Purple");
                break;
            } else {
                System.out.println("Something went wrong type the numbers between 1-7");
            }
        }
    }
// Метод для работы с последовательностью фибоначчи
    public static void fibonacci()
    {
        long sum = 0;
        int numbersInsequence;
        long firstPrevious = 0;
        long secondPrevious = 1;
        boolean useFibonacciOnceAgain = true;
        while (useFibonacciOnceAgain == true) {
            System.out.println("Enter the number of numbers in the sequence you want to print");
            numbersInsequence = inputIntNumber();
            System.out.println("The fibonacci sequence: ");
            System.out.println("1. " + firstPrevious);
            if (numbersInsequence == 1) {
                return;
            }
            System.out.println("2. " + secondPrevious);
            for (int i = 3; numbersInsequence > 0; numbersInsequence--, i++) {
                sum = firstPrevious + secondPrevious;
                System.out.println(i + ". " + sum);
                firstPrevious = secondPrevious;
                secondPrevious = sum;
            }
            System.out.println("Do you  want to use the Fibonacci once again?");
            System.out.println("Type true to use Fibonacci. Type false to exit");
            useFibonacciOnceAgain = useTheProgram();
        }
    }

    // Метод расчитывающий проценты по вкладу
    // В общем тут я узнал, что есть тип данных который лучше использовать для денег - BigDecimal
    // И теперь под этим методом будет метод реализующий ввод BigDecimal с клавиатуры
    public static void deposit()
    {
        System.out.println( "Input the amount of deposit");
        BigDecimal depositAmount = inputBigDecimal();
        BigDecimal stockAmountOfDeposit = depositAmount;
        System.out.println( "Input the monthly percent rate. For example 12 if there 12 percents per month");
        BigDecimal percentsRate = inputBigDecimal();
        System.out.println( "enter the number of months for which you want to make a deposit");
        BigDecimal constForPercents = new BigDecimal("100.00");
        int months = inputIntNumber();
        BigDecimal income = new BigDecimal("0");
        for (int i = 1; months > 0; i++, months--)
        {
            BigDecimal monthlyIncome = depositAmount.multiply(percentsRate).divide(constForPercents, 2, RoundingMode.HALF_UP);
            income = income.add(monthlyIncome);
            depositAmount = depositAmount.add(monthlyIncome);
            System.out.println( "Income for month " + i + " is " +  monthlyIncome);
        }
        System.out.println("Deposit amount was " + stockAmountOfDeposit + " Total percent income: " + " is " +  income);
        System.out.println("So Deposit amount now is " + depositAmount);
    }
    // Собсно метод на ввод BigDecimal
    public static BigDecimal inputBigDecimal()
    {
        BigDecimal Number;
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextBigDecimal())
        {
            System.out.println("You've entered the wrong number");
            scanner.close();
            System.exit(1);
        }
        Number = scanner.nextBigDecimal();

        return (Number);
    }
// Узнать время года по месяцу IF
    public static void seasonWithIf()
    {
        while (1>0) {
            System.out.println("Enter the number of month");
            int monthNumber = inputIntNumber();
            if (monthNumber < 3 || monthNumber == 12) {
                System.out.println("Winter");
                break;
            } else if (monthNumber >= 3 && monthNumber <= 5) {
                System.out.println("Spring");
                break;
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                System.out.println("Summer");
                break;
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                System.out.println("Autumn");
                break;
            } else
                System.out.println("Something went wrong, input the numbers fom 1 to 12");
        }
    }
    //Узнать время года по месяцу switch
    public static void seasonWithSwitch() {
        while (true) {
            System.out.println("Enter the number of month:");
            int monthNumber = inputIntNumber(); // Предполагается, что функция inputIntNumber() корректно считывает и возвращает целочисленное значение.
            switch (monthNumber) {
                case 12:
                    System.out.println("December");
                case 1:
                    System.out.println("January");
                case 2:
                    System.out.println("Winter");
                    System.out.println("February");
                    return;
                case 3:
                    System.out.println("March");
                case 4:
                    System.out.println("April");
                case 5:
                    System.out.println("Spring");
                    System.out.println("May");
                    return;
                case 6:
                    System.out.println("June");
                case 7:
                    System.out.println("July");
                case 8:
                    System.out.println("Summer");
                    System.out.println("August");
                    return;
                case 9:
                    System.out.println("September");
                case 10:
                    System.out.println("October");
                case 11:
                    System.out.println("Autumn");
                    System.out.println("November");
                    return;
                default:
                    System.out.println("Something went wrong, input the numbers from 1 to 12");
            }
        }
    }
//Это под задачу с темепратурой
    public static void outsideTemperature()
    {
        System.out.println("Enter the temperature");
        int temp = inputIntNumber();
        if (temp <= coldTemp)
        {
            System.out.println("It's cold");
        }
        else if (warmTemp >= temp && temp > coldTemp)
        {
            System.out.println("It's normal");
        }
        else if (warmTemp < temp)
        {
            System.out.println("It's warm");
        }
    }
    // Мне лень писать 2 разных методов под задачу 3 и 4 и потом их вызовы
    // По этому они будут в одном методе
    public static void cycles()
    {
        System.out.println("odd numbers from 1 to 100");
        for (int i = 1; i < 100; i++)
        {
            if (i%2 > 0)
            {
                System.out.println(i);
            }
        }
        System.out.println("numbers form 5 to 1");
        for (int i = 5; i > 0; i--)
        {
            System.out.println(i);
        }
    }
    //Под задачу 5 c вычислением суммы всех чисел до того, которое ввел пользователь
    public static void sumOfNumbers()
    {
        System.out.println("enter the number up to which you want to know the amount");
        int number = inputIntNumber();
        int defaultNumber = number;
        int sum = 0;
        if (number <= 0)
        {
            System.out.println("You entered the wrong number. Enter a positive number");
            return;
        }else
        {
            for (int i = 0; number>0; number--)
            {
                sum = sum + number;
            }
            System.out.println("You entered " + defaultNumber + " the sum of all numbers before it is " + sum);
        }
    }

    //Под задачу 6 с последовательностью
    public static void sequence ()
    {
        while (true) {
            System.out.println("Enter the first number form which we will start");
            int firsNumber = inputIntNumber();
            System.out.println("Enter the second number where we will end");
            int secondNumber = inputIntNumber();
            System.out.println("Enter the step");
            int step = inputIntNumber();
            if (firsNumber < secondNumber && step >0) {
                for (int i = firsNumber; i < secondNumber; i = i + step)
                {
                    System.out.println(i);
                }
                break;
            }
            else if (firsNumber > secondNumber && step < 0)
            {
                for (int i = firsNumber; i > secondNumber; i = i + step)
                {
                    System.out.println(i);
                }
                break;
            }
            else
                System.out.println("Something went wrong");
        }
    }
}
