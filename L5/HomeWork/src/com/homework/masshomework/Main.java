package com.homework.masshomework;

import java.util.Random;
import java.util.Scanner;

/*      1. Нужно считать с консоли число, создать целочисленный массив размером введенного числа, заполнить его (с помощью класса Random)
        Пробежаться по массиву в цикле и найти совпадающее число с введенным (второе введенное число), вывести результат в консоль(нашлось или нет) поиск
        числа в массиве реализовать с помощью цикла foreach

        2. Найти наибольшее число в данном массиве.

        3. Реализовать простейший калькулятор используя кострукцию switch-case (в другом классе с методом main)
        с консоли вводится два числа, которые будут принимать участие в операции
        Далее выводится сообщение в таком виде: Выберете операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком
        Вывести результат операции.*/
/*public class Main {
    public static void main(String[] args) {
        Scanner inputFromCommandLine = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int massLength = inputFromCommandLine.nextInt();
        int[] mass = new int[massLength];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(30);
        }
        System.out.println("Введите число для поиска в массиве");
        int number = inputFromCommandLine.nextInt();

        for (int element : mass) {
            if (element == number) {
                System.out.println(element);
            }
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner inputFromCommandLine = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int massLength = inputFromCommandLine.nextInt();
        int[] mass = new int[massLength];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(30);
        }
        System.out.println("Введите число для поиска в массиве");
        int number = inputFromCommandLine.nextInt();

        for (int element : mass) {
            if (element == number) {
                System.out.println(element);
            }
        }
        int max = mass[0];
        for(int element:mass){
            if(element>max){
                max=element;
            }
        }
        System.out.println("Максималтная значение: " + max);
    }
}*/

        public class Main {
    public static void main(String[] args) {
        Scanner inputFromCommandLine = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int massLength = inputFromCommandLine.nextInt();
        int[] mass = new int[massLength];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(30);
        }
        System.out.println("Введите число для поиска в массиве");
        int number = inputFromCommandLine.nextInt();

        for (int element : mass) {
            if (element == number) {
                System.out.println(element);
            }
        }

        mass[8] = 9999;

        int max = mass[0];
        for(int element:mass){
            if(element>max){
                max=element;
            }
        }
        System.out.println("Максималтная значение: " + max);
    }
}




