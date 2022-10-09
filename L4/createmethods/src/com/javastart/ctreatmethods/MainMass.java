/*
package com.javastart.ctreatmethods;

import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] mass = new int[5];

        for(int i = 0; i < 5; i++) {
            int newElement = i + 1;
            mass[i] = newElement;
            System.out.println("Значение индекса: " + i + " Згачение элемента: " + newElement );
        }
    }

}
*/


/*
package com.javastart.ctreatmethods;

import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] mass = new int[5];

        for(int i = 0; i < 5; i++) {
           mass[i] = input.nextInt();
        }

        printMass(mass);

    }
    public static void printMass (int[] mass) {
        for (int i = 0; i < mass.length ; i++) {
            System.out.println("Значение индекса: " + i + " Згачение элемента: " + mass[i] );

        }
    }
}
*/

/*
package com.javastart.ctreatmethods;

import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] mass = new int[5];

        for(int i = 0; i < 5; i++) {
            mass[i] = input.nextInt();
        }

        printMass(mass);

    }
    public static void printMass (int[] mass) {
      for (int element : mass) {
          System.out.println("Элемент: " + element);
      }
    }
}
*/

/*package com.javastart.ctreatmethods;

import java.util.Scanner;

public class MainMass {



    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] mass = new int[5];
        for(int i = 0; i < 5; i++) {
            mass[i] = input.nextInt();
        }
        printMass(mass);
        printDayOfWeek(5);
    }
    public static  void printDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    public static void printMass (int[] mass) {
        for (int element : mass) {
            System.out.println("Элемент: " + element);
        }
    }
}*/

package com.javastart.ctreatmethods;
public class MainMass {
    public static void main(String[] args) {
        printDayOfWeek(5);
    }
    public static  void printDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    public static void printMass (int[] mass) {
        for (int element : mass) {
            System.out.println("Элемент: " + element);
        }
    }
}






/*1. Нужно считать с консоли число, создать целочисленный массив размером введенного числа, заполнить его (с помощью класса Random)
        Пробежаться по массиву в цикле и найти совпадающее число с введенным (второе введенное число), вывести результат в консоль(нашлось или нет) поиск
        числа в массиве реализовать с помощью цикла foreach
        2. Найти наибольшее число в данном массиве.
        3. Реализовать простейший калькулятор используя кострукцию switch-case (в другом классе с методом main)
        с консоли вводится два числа, которые будут принимать участие в операции
        Далее выводится сообщение в таком виде: Выберете операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком
        Вывести результат операции.*/
