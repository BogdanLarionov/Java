/*
package com.javastart.booleanlogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  //metod
    Scanner inputFromLine = new Scanner(System.in);

    int firstNumber;
    int secondNumber;
    int result;

        System.out.println("Введите первое число");
        firstNumber = inputFromLine.nextInt();

        System.out.println("Введите второе число");
        secondNumber = inputFromLine.nextInt();

        result = firstNumber + secondNumber;
        System.out.println("Сумма: " +result);
    }
}

*/


/*
package com.javastart.booleanlogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  //metod
        Scanner inputFromLine = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        System.out.println("Введите первое число");
        firstNumber = inputFromLine.nextInt();

        System.out.println("Введите второе число");
        secondNumber = inputFromLine.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Первое число больше");
            
        }else{
            System.out.println("Второе число больше:");
        }
    }
}*/


/*package com.javastart.booleanlogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  //metod
        Scanner inputFromLine = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        String inputFirstNumber = "Введите первое число";
        String inputSecondNumber = "Введите второе число";
        String firstIsBigger = "Первое число больше";
        String secondIsBigger = "Второе число больше";
        String numbersAreEquals = "Числа равны";


        System.out.println(inputFirstNumber);
        firstNumber = inputFromLine.nextInt();

        System.out.println(inputSecondNumber);
        secondNumber = inputFromLine.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstIsBigger);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondIsBigger);
        } else  {
            System.out.println(numbersAreEquals);
        }
    }
}*/

package com.javastart.booleanlogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  //metod
        Scanner inputFromLine = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        String inputFirstNumber = "Введите первое число";
        String inputSecondNumber = "Введите второе число";
        String firstIsBigger = "Первое число больше";
        String secondIsBigger = "Второе число больше";
        String numbersAreEquals = "Числа равны";


        System.out.println(inputFirstNumber);
        firstNumber = inputFromLine.nextInt();

        System.out.println(inputSecondNumber);
        secondNumber = inputFromLine.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstIsBigger);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondIsBigger);
        } else  {
            System.out.println(numbersAreEquals);
        }
        int a = 10;
        byte b = (byte) a;

        short c;
        c = b;

        long d = a;
    }
}




