import java.io.Console;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Arrays;

public class OldStuff {
    public static final int coldTemp = -20;
    public static final int warmTemp = -5;

    public static void showMenu() {
        //Тут я угорел и решил запилить что-то типа меню в main, а все
        //остальное вывести в отдельные функции. Собсна это оно и есть
        //В процессе запила мне пришла мысль, что не плохо бы это все разнести в классы а в
        //main оставить только вызовы клаасов, но вероятность того, что мне хватит времени крайне мала
        Random random = new Random();
        UseProgramPrint();
        String order;
        boolean useTheProgram = InputBoolean();
        while (useTheProgram == true) {
            menuOptionsPrint();
            order = menuNavigation();
            if (order.equalsIgnoreCase("1")) {
                calc();
            } else if ((order.equalsIgnoreCase("2"))) {
                rainbow();
            } else if (order.equalsIgnoreCase("3")) {
                fibonacci();
            } else if (order.equalsIgnoreCase("4")) {
                deposit();
            } else if (order.equalsIgnoreCase("5")) {
                seasonWithIf();
            } else if (order.equalsIgnoreCase("6")) {
                seasonWithSwitch();
            } else if (order.equalsIgnoreCase("7")) {
                outsideTemperature();
            } else if (order.equalsIgnoreCase("8")) {
                cycles();
            } else if (order.equalsIgnoreCase("9")) {
                sumOfNumbers();
            } else if (order.equalsIgnoreCase("10")) {
                sequence();
            } else if (order.equalsIgnoreCase("11")) {
                multiplicationTable();
            } else if (order.equalsIgnoreCase("12")) {
                removeTheNumberFromArray();
            } else if (order.equalsIgnoreCase("13")) {
                ArrayOfEvenNumbers();
            } else if (order.equalsIgnoreCase("14")) {
                FindTheNumberInTheArray();
            } else if (order.equalsIgnoreCase("15")) {
                replacingAnElementWithOddIndex();
            } else if (order.equalsIgnoreCase("16")) {
                ArrayOfEvenNumbersPlus();
            } else if (order.equalsIgnoreCase("17")) {
                checkTheMiddle();
            } else if (order.equalsIgnoreCase("18")) {
                checkTheDiagonalOf2DArray();
            } else if (order.equalsIgnoreCase("19")) {
                raiseTheArray();
            } else if (order.equalsIgnoreCase("20")) {
                chess();
            } else if (order.equalsIgnoreCase("21")) {
                summOf2dArray();
            } else if (order.equalsIgnoreCase("22")) {
                sortOfThe2DArrayByAsc();
            } else if (order.equalsIgnoreCase("23")) {
                sortOfThe2DArrayByDesc();
            } else if (order.equalsIgnoreCase("24")) {
                matrixMultiplication();
            } else {
                System.out.println("Go and do " + order + " yourself");
            }

            UseProgramPrint();
            useTheProgram = InputBoolean();
            if (useTheProgram == false)
                Main.menuNavigation();
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
        System.out.println("Type 1 to use the calculator");
        System.out.println("Type 2 to find out the name of the colour by its number");
        System.out.println("Type 3 to see the fibonacci sequence");
        System.out.println("Type 4 to calculate the deposit income");
        System.out.println("Type 5 to find out the time of year by month realised by IF");
        System.out.println("Type 6 SeasonSwc to find out the time of year by month realised by Switch");
        System.out.println("Type 7 to find out is it cold outside or not");
        System.out.println("Type 8 to check 3 and 4 tasks");
        System.out.println("Type 9 to find out the sum to this number");
        System.out.println("Type 10 to see the sequence (task number 6)");
        System.out.println("Type 11 to see the multiplication table");
        System.out.println("Type 12 to remove number from for array");
        System.out.println("Type 13 to see the Array of even numbers");
        System.out.println("Type 14 to see is the number in the Array");
        System.out.println("Type 15 Replacing an element of the array with an odd index with 0");
        System.out.println("Type 16 to see the Array of even number + max and min and middle");
        System.out.println("Type 17 to combine the middle of two arrays");
        System.out.println("Type 18 to see the info about array's diagonals");
        System.out.println("Type 19 to add the number to every element in the number");
        System.out.println("Type 20 to see the Chess board");
        System.out.println("Type 21 to see summ of 2D array");
        System.out.println("Type 22 to sort the 2D array by Ascending");
        System.out.println("Type 23 to sort the 2D array by Descending");
        System.out.println("Type 24 to multiply the matrix");
    }

    //Тупо метод под работу с прогаммой, надо или нет, вызыам то цикла и после, печать так же вынес отдельно
    //Решил переиспользолвать для опроса пользователя надо ли что-то использовать еще раз
    public static boolean InputBoolean()
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
        while (!scanner.hasNextInt()) {  // Проверка, является ли введенное значение целым числом
            System.out.println("You've entered the wrong number. Please enter a valid integer:");
            scanner.next();  // Считываем и отбрасываем некорректный ввод, чтобы очистить буфер
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
            useFibonacciOnceAgain = InputBoolean();
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
    //Таблица умножения. Кривенько, но как есть
    public static void multiplicationTable()
    {
        for (int k = 10; k >= 0; k--)
        {
            for (int i = 0; i <= k; i++)
            {
                System.out.println(" " + i + "*" + k + " " + i*k);
            }
        }
    }
    //Удаляем элемент из массива
    public static void removeTheNumberFromArray()
    {
        Random random = new Random();
        System.out.println("Enter the volume of array");
        int volume = inputIntNumber();
        int[] badArray = new int[volume];
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber= inputIntNumber();
        for (int i = 0; i < badArray.length; i++) {
            badArray[i] = random.nextInt(randomNumber);
        }
        //До этого шага все +/- понятно, создали массив, из которого будем удалять
        //Проиницализировали все, заполнили значениями
        System.out.println("Enter the number that you need to remove from array");
        int numberToRemove = inputIntNumber();
        //Вот тут уже начинается хардкоринка
        //Завели переменную под флаг, нужно что бы определять были ли в исходном массиве числа которые надо удалить
        //Завел переменную к - она будет нужна для определения размеров второго массива, куда все сложим.
        boolean flag = false;
        int k = 0;
        for (int i = 0; i < badArray.length; i++)
        {
            if (badArray[i] == numberToRemove) {
                flag = true;
            }
            else
            {
                k++;
            }
        }
        //А теперь надо создать и принициализировать второй массив с размерностью к
        //и сложить туда все что нам нужно
        //При каждой итерации переменная num принимает значение текущего элемента массива badArray, в котором
        //есть числа которые надо удалить
        //внутри тела цикла находится условие, которое проверяет, не равен ли текущий элемент num
        //значению numberToRemove
        //Записали нужное значение в новый массив а потом переключили на следуюший индекс
        //+ переделал таким образом, что если НЕ обнаружено вхождений в if наверху, то со вторым массивом не морочимся
        if (flag == true)
        {
            int[] newArrayAfterRemovingTheBadNumber = new int[k];
            int j = 0;
            for (int num : badArray)
            {
                if (num != numberToRemove)
                {
                    newArrayAfterRemovingTheBadNumber[j] = num;
                    j++;
                }

            }
            System.out.println("The bad number was " +numberToRemove + " The array was:");
            System.out.println(Arrays.toString(badArray));
            System.out.println("The new array ");
            System.out.println(Arrays.toString(newArrayAfterRemovingTheBadNumber));
        }
        else
        {
            System.out.println("There was nothing to remove");
            System.out.println("The bad number was " +numberToRemove + " The array was:");
            System.out.println(Arrays.toString(badArray));
        }
    }
    //Массив четных чисел
    public static void ArrayOfEvenNumbers()
    {
        Random random = new Random();
        int volume;
        System.out.println("Enter the volume of array between 6 to 10");
        Scanner scanner = new Scanner(System.in);
        volume = inputIntNumber();
        if (volume <=5 || volume >10)
        {
            System.out.println("You've entered the wrong number enter the numbers from 6 to 10");
            scanner.close();
            System.exit(1);
        }
        //Ввели размер массива и добавили проверку на ввод
        int[] badArray = new int[volume];
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber= inputIntNumber();
        for (int i = 0; i < badArray.length; i++) {
            badArray[i] = random.nextInt(randomNumber);
        }
        //До этого шага все +/- понятно, создали массив, из которого будем удалять
        //Проиницализировали все, заполнили значениями

        boolean flag = false;
        int k = 0;
        for (int i = 0; i < badArray.length; i++)
        {
            if (badArray[i] %2 == 0) {
                flag = true;
                k++;
            }
        }

        if (flag == true)
        {
            int[] newArrayAfterRemovingTheBadNumber = new int[k];
            int j = 0;
            for (int num : badArray)
            {
                if (num %2 == 0)
                {
                    newArrayAfterRemovingTheBadNumber[j] = num;
                    j++;
                }

            }
            System.out.println("Initially the array contained numbers");
            System.out.println(Arrays.toString(badArray));
            System.out.println("The new array ");
            System.out.println(Arrays.toString(newArrayAfterRemovingTheBadNumber));
        }
        else
        {
            System.out.println("There was no even numbers in the array");
            System.out.println(Arrays.toString(badArray));
            System.exit(1);
        }
    }
    //Задача 0 входит ли число в массив или нет
    public static void FindTheNumberInTheArray()
    {
        Random random = new Random();
        int volume;
        System.out.println("Enter the volume of array");
        Scanner scanner = new Scanner(System.in);
        volume = inputIntNumber();
        System.out.println("Enter The Number that you want to check");
        int numberToCheck = inputIntNumber();
        int[] badArray = new int[volume];
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber= inputIntNumber();
        for (int i = 0; i < badArray.length; i++) {
            badArray[i] = random.nextInt(randomNumber);
        }
        for (int i = 0; i < badArray.length; i++)
        {
            if (badArray[i] == numberToCheck) {
                System.out.println("We found the number that you are searching for Index of an element in an array " + i +"-"+ badArray[i]);
            }
        }
        System.out.println("Initially the array contained numbers");
        System.out.println(Arrays.toString(badArray));
    }
    //Задача 5/2 замена нечетного индекса на 0
    public static void replacingAnElementWithOddIndex()
    {
        Random random = new Random();
        int volume;
        System.out.println("Enter the volume of array");
        Scanner scanner = new Scanner(System.in);
        volume = inputIntNumber();
        int[] badArray = new int[volume];
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber= inputIntNumber();
        for (int i = 0; i < badArray.length; i++) {
            badArray[i] = random.nextInt(randomNumber);
        }
        System.out.println("Initially the array contained numbers");
        System.out.println(Arrays.toString(badArray));
        for (int i = 0; i < badArray.length; i++)
        {
            if (i % 2 != 0)
            {
                badArray[i] =0;
            }
        }
        System.out.println("The new Array");
        System.out.println(Arrays.toString(badArray));
    }

    //Задача 2 на макс, мин и среднее арифмет значение +
    //Второй массив только из четных
    public static void ArrayOfEvenNumbersPlus() {
        Random random = new Random();
        int volume;
        System.out.println("Enter the volume of array");
        Scanner scanner = new Scanner(System.in);
        volume = inputIntNumber();
        while (volume<=0)
        {
            System.out.println("Enter the volume of array");
            volume = inputIntNumber();
        }
        //Ввели размер массива и добавили проверку на ввод
        int[] badArray = new int[volume];
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber = inputIntNumber();
        for (int i = 0; i < badArray.length; i++) {
            badArray[i] = random.nextInt(randomNumber);
        }
        //До этого шага все +/- понятно, создали массив, из которого будем удалять
        //Проиницализировали все, заполнили значениями

        boolean flag = false;
        int k = 0;
        int max = badArray[0];
        int min = 0;
        int sum = 0;
        int counter = 0;
        double middle = 0;
        for (int i = 0; i < badArray.length; i++) {
            counter++;
            sum = sum + badArray[i];
            if (badArray[i] > max) {
                max = badArray[i];
            }
            if (badArray[i] < min) {
                min = badArray[i];
            }

            if (badArray[i] % 2 == 0) {
                flag = true;
                k++;
            }
        }
        middle = sum / counter;
        if (flag == true) {
            int[] newArrayAfterRemovingTheBadNumber = new int[k];
            int j = 0;
            for (int num : badArray) {
                if (num % 2 == 0) {
                    newArrayAfterRemovingTheBadNumber[j] = num;
                    j++;
                }

            }
            System.out.println("Initially the array contained numbers");
            System.out.println(Arrays.toString(badArray));
            System.out.println("The new array ");
            System.out.println(Arrays.toString(newArrayAfterRemovingTheBadNumber));
            System.out.println("The Maximum is: " + max +" The minimum is: " + " The middle is: " + middle);
        } else {
            System.out.println("There was no even numbers in the array");
            System.out.println("The Maximum is: " + max +" The minimum is: " + min + " The middle is: " + middle);
            System.out.println(Arrays.toString(badArray));
            System.exit(1);
        }
    }

    //Срвниваем среднее арефмет 2 массивов
    public static void checkTheMiddle()
    {
        Random random = new Random();
        //Ввели размер массива и добавили проверку на ввод
        int[] badArray = new int[5];
        int sum1 = 0;
        double middle1 = 0;
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber = inputIntNumber();
        for (int i = 0; i < badArray.length; i++) {
            badArray[i] = random.nextInt(randomNumber);
            sum1 = sum1+ badArray[i];
        }
        middle1 = sum1/5;
        int[] goodArray = new int[5];
        int sum2 = 0;
        double middle2 = 0;
        for (int i = 0; i < goodArray.length; i++) {
            goodArray[i] = random.nextInt(randomNumber);
            sum2 = sum2+ goodArray[i];
        }
        middle2 = sum2/5;
        System.out.println("The first Array is");
        System.out.println(Arrays.toString(badArray));
        System.out.println("The second Array is");
        System.out.println(Arrays.toString(goodArray));
        if(middle1 > middle2)
        {
            System.out.println("Thr average of first array is bigger "+ middle1 +" > " + middle2);
        }
        if(middle1 == middle2)
        {
            System.out.println("Thr averages are equal "+ middle1 +" = " + middle2);
        }
        if(middle1 < middle2)
        {
            System.out.println("Thr average of first array is smaller "+ middle1 +" < " + middle2);
        }
    }
    //Под задачу с диагоналями
    public static void checkTheDiagonalOf2DArray()
    {
        //Тут создаем двумерный массив и заполняем значениями
        //Есть нюанс, если матрица будет не квадратная, а именно, если число массивов будет > чем число
        //Элеметов для каждого массива то упадем с ошибкой, по этому задаем размер массива через 1 переменную
        System.out.println("Enter the volume of array");
        int value = inputIntNumber();
        int[][] arrayToCheckTheDiagonal = new int[value][value];
        Random random= new Random();
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber= inputIntNumber();
        for (int i = 0; i < arrayToCheckTheDiagonal.length; i++ ){
            for (int j = 0; j < arrayToCheckTheDiagonal[i].length; j++) {
                arrayToCheckTheDiagonal[i][j] = random.nextInt(randomNumber);
            }
        }
        //Тут работаем с главной диагональю
        System.out.println("The main array is: ");
        for (int i = 0; i < arrayToCheckTheDiagonal.length; i++) {
            System.out.println(Arrays.toString(arrayToCheckTheDiagonal[i]));
        }
        System.out.println("The main diagonal is: ");
        int sumOfMainDiagonal = 0;
        for (int i = 0; i < arrayToCheckTheDiagonal.length ; i++) {
            System.out.println("[" + arrayToCheckTheDiagonal[i][i] + "]");
            sumOfMainDiagonal = sumOfMainDiagonal + arrayToCheckTheDiagonal[i][i];
        }
        System.out.println("The sum of all elements for main diagonal: " + sumOfMainDiagonal);
        //Тут начинаем работать с побочной диагональю
        System.out.println("The side diagonal is: ");
        int sumOfSideDiagonal = 0;
        //Тут возникла проблема с тем что бы брать элементы с индексом 0, 1 и тд из одномерного массива
        //Ничего умнее чем завести под это дополнительную переменную я не придумал
        //Второй цикл вроде не подходит, т.к. надо взять 1 элемент, а не всю строку
        int j =0;
        for (int i = value -1; i >= 0; i--)
        {
            System.out.println("[" + arrayToCheckTheDiagonal[i][j] + "]");
            sumOfSideDiagonal = sumOfSideDiagonal + arrayToCheckTheDiagonal[i][j];
            j++;
        }
        System.out.println("The sum of all elements for side diagonal: " + sumOfSideDiagonal);
    }

    // Задача по добавлению числа к каждому элементу трехмерного массива
    public static void raiseTheArray()
    {
        System.out.println("Enter the volume of array");
        int value = inputIntNumber();
        int[][][] arrayToRaise = new int[value][value][value];
        Random random= new Random();
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber= inputIntNumber();
        for (int i = 0; i < arrayToRaise.length; i++ )
        {
            for (int j = 0; j < arrayToRaise[i].length; j++)
            {
                for (int k = 0; k < arrayToRaise[j].length; k++)
                {
                    arrayToRaise[i][j][k] = random.nextInt(randomNumber);
                }
            }
        }
        System.out.println("The main array was:");
        for (int i = 0; i < arrayToRaise.length; i++) {
            for (int j = 0; j < arrayToRaise[i].length; j++) {
                for (int k = 0; k < arrayToRaise[i][j].length; k++) {
                    System.out.print(arrayToRaise[i][j][k] + " ");
                }
                System.out.println(); // Новая строка для каждой внутренней последовательности
            }
            System.out.println(); // Дополнительная пустая строка между слоями
        }
        System.out.println("Enter the value that you want to add to the array");
        int summator = inputIntNumber();
        for (int i = 0; i < arrayToRaise.length; i++ ){
            for (int j = 0; j < arrayToRaise[i].length; j++) {
                for (int k = 0; k < arrayToRaise[j].length; k++)
                    arrayToRaise[i][j][k] =  arrayToRaise[i][j][k] + summator;
            }
        }
        System.out.println("The new array is:");
        for (int i = 0; i < arrayToRaise.length; i++) {
            for (int j = 0; j < arrayToRaise[i].length; j++) {
                for (int k = 0; k < arrayToRaise[i][j].length; k++) {
                    System.out.print(arrayToRaise[i][j][k] + " ");
                }
                System.out.println(); // Новая строка для каждой внутренней последовательности
            }
            System.out.println(); // Дополнительная пустая строка между слоями
        }
    }
    //Задача на вывод шахматной доски
    public static void chess ()
    {
        char [][] chessArray = new char[8][8];
        for (int i = 0; i < chessArray.length; i++ )
        {
            if (i%2 == 0)
            {
                for (int j = 0; j < chessArray[i].length; j++)
                {
                    if (j%2 == 0)
                    {
                        chessArray[i][j] = 'W';
                    }
                    else
                    {
                        chessArray[i][j] = 'B';
                    }
                }
            }
            else
            {
                for (int j = 0; j < chessArray[i].length; j++)
                {
                    if (j%2 == 0)
                    {
                        chessArray[i][j] = 'B';
                    }
                    else
                    {
                        chessArray[i][j] = 'W';
                    }
                }
            }
        }
        for (int i = 0; i < chessArray.length; i++)
        {
            System.out.println(Arrays.toString(chessArray[i]));
        }
    }
    //Задача на сумму элементов двумерного массива
    public static void summOf2dArray()
    {
        System.out.println("Enter the number of arrays for 2d array");
        int numberOfArrays = inputIntNumber();
        System.out.println("Enter the value for each 1d array in 2d array");
        int value = inputIntNumber();
        int[][] arrayToCheckTheSumm = new int[numberOfArrays][value];
        Random random= new Random();
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber= inputIntNumber();
        for (int i = 0; i < arrayToCheckTheSumm.length; i++ )
        {
            for (int j = 0; j < arrayToCheckTheSumm[i].length; j++)
            {
                arrayToCheckTheSumm[i][j] = random.nextInt(randomNumber);
            }
        }
        System.out.println("The array is: ");
        for (int i = 0; i < arrayToCheckTheSumm.length; i++)
        {
            System.out.println(Arrays.toString(arrayToCheckTheSumm[i]));
        }
        int sum = 0;
        for (int i = 0; i < arrayToCheckTheSumm.length; i++ )
        {
            for (int j = 0; j < arrayToCheckTheSumm[i].length; j++)
            {
                sum  = sum + arrayToCheckTheSumm[i][j];
            }
        }
        System.out.println("The total sum of all elements is " + sum);
    }
    //Сотировка двумерного массива по возрастанию
    public static void sortOfThe2DArrayByAsc() {
        //Тут создаем двумерный массив и заполняем значениями
        System.out.println("Enter the number of arrays for 2d array");
        int numberOfArrays = inputIntNumber();
        System.out.println("Enter the value for each 1d array in 2d array");
        int value = inputIntNumber();
        int[][] arrayToSort = new int[numberOfArrays][value];
        Random random = new Random();
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber = inputIntNumber();
        for (int i = 0; i < arrayToSort.length; i++)
        {
            for (int j = 0; j < arrayToSort[i].length; j++)
            {
                arrayToSort[i][j] = random.nextInt(randomNumber);
            }
        }
        //Вывели на печать изначальный массив
        System.out.println("The array was: ");
        for (int i = 0; i < arrayToSort.length; i++)
        {
            System.out.println(Arrays.toString(arrayToSort[i]));
        }
        //Начинаем сортировать
        for (int i = 0; i < arrayToSort.length; i++)
        {
            for (int j = 0; j < arrayToSort[i].length; j++)
            {
                for (int k = 0; k < arrayToSort[j].length -1; k++)
                {
                    if (arrayToSort[j][k] > arrayToSort[j][k + 1])
                    {
                        int temp = arrayToSort[j][k+1];
                        arrayToSort[j][k+1] = arrayToSort[j][k];
                        arrayToSort[j][k] = temp;
                    }
                }
            }
        }
        //Вывели на печать отсортированный массив
        System.out.println("The new array is: ");
        for (int i = 0; i < arrayToSort.length; i++)
        {
            System.out.println(Arrays.toString(arrayToSort[i]));
        }
    }
    public static void sortOfThe2DArrayByDesc() {
        //Тут создаем двумерный массив и заполняем значениями
        System.out.println("Enter the number of arrays for 2d array");
        int numberOfArrays = inputIntNumber();
        System.out.println("Enter the value for each 1d array in 2d array");
        int value = inputIntNumber();
        int[][] arrayToSort = new int[numberOfArrays][value];
        Random random = new Random();
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber = inputIntNumber();
        for (int i = 0; i < arrayToSort.length; i++)
        {
            for (int j = 0; j < arrayToSort[i].length; j++)
            {
                arrayToSort[i][j] = random.nextInt(randomNumber);
            }
        }
        //Вывели на печать изначальный массив
        System.out.println("The array was: ");
        for (int i = 0; i < arrayToSort.length; i++)
        {
            System.out.println(Arrays.toString(arrayToSort[i]));
        }
        //Начинаем сортировать
        for (int i = 0; i < arrayToSort.length; i++)
        {
            for (int j = 0; j < arrayToSort[i].length; j++)
            {
                for (int k = 0; k < arrayToSort[j].length -1; k++)
                {
                    if (arrayToSort[j][k] < arrayToSort[j][k + 1])
                    {
                        int temp = arrayToSort[j][k+1];
                        arrayToSort[j][k+1] = arrayToSort[j][k];
                        arrayToSort[j][k] = temp;
                    }
                }
            }
        }
        //Вывели на печать отсортированный массив
        System.out.println("The new array is: ");
        for (int i = 0; i < arrayToSort.length; i++)
        {
            System.out.println(Arrays.toString(arrayToSort[i]));
        }
    }
    //Умножение матриц
    public static void matrixMultiplication()
    {
        //по условию задачи оба массива должны быть квадратными и одинаковой длинны
        //По этому размеры массивов буду задавать 1 переменной
        System.out.println("Enter the volume of array");
        int value = inputIntNumber();
        int[][] firstArrayToMultiply = new int[value][value];
        int[][] secondArrayToMultiply = new int[value][value];
        Random random = new Random();
        System.out.println("Enter the range of random number that will be entered in the array");
        System.out.println("Example: if you'll enter 10 - then there will be numbers from 0 to 9");
        int randomNumber = inputIntNumber();
        for (int i = 0; i < firstArrayToMultiply.length; i++)
        {
            for (int j = 0; j < firstArrayToMultiply[i].length; j++)
            {
                firstArrayToMultiply[i][j] = random.nextInt(randomNumber);
                secondArrayToMultiply[i][j] = random.nextInt(randomNumber);
            }
        }

        //До этого момента создали и заполнили оба массива
        System.out.println("The arrays are: ");
        for (int i = 0; i < firstArrayToMultiply.length; i++)
        {
            System.out.println(Arrays.toString(firstArrayToMultiply[i]));
        }
        System.out.println(" ");
        for (int i = 0; i < secondArrayToMultiply.length; i++)
        {
            System.out.println(Arrays.toString(secondArrayToMultiply[i]));
        }
        //После вывода на печать начинаем работать с результирующим массивом
        //Я решил сложить значения туда
        int[][] resultArray = new int[value][value];
        for (int i = 0; i < value; i++)
        {
            for (int j = 0; j < value; j++)
            {
                for (int k = 0; k < value; k++)
                {
                    resultArray[i][j] = resultArray[i][j] + firstArrayToMultiply[i][k] * secondArrayToMultiply[k][j];
                }
            }
        }
        System.out.println("The result array is: ");
        for (int i = 0; i < firstArrayToMultiply.length; i++)
        {
            System.out.println(Arrays.toString(resultArray[i]));
        }
    }
}
