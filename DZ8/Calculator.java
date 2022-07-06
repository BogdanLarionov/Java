package com.telran.berlin.game.calc;

import java.util.Scanner;

public class Calculator {

//     Консольный ввод

    //Scanner scan =new Scanner(System.in); //создаем новый обьект класса Scanner и присваиваем название(имя) переменной, создаем новый Scanner в параметре которого передать Обьект стандартного ввода данных System.in
    //int ms = read.nextInt(); //создаем переменную типа int и присваиваем ей имя (ms) = у обьекта read нужно вызвать метод nextInt()

        public static void main(String[] args) {
            Scanner calc = new Scanner(System.in);


            System.out.println("Hey, quicker enter the first number:");
            int number1 = calc.nextInt();
            System.out.println("Thank you! You entered the first number: " + number1);
            System.out.println("Let's go enter the second number:");
            int number2 = calc.nextInt();
            System.out.println("Your ansver = " + (number1 + number2));

            System.out.println("Your ansver = " + (number1 - number2));


    }
}

//    Напишите программу, которая получает два целых числа от пользователя и отображает (for 500 and 125)
//        number1 = 500   number2 = 125
//        500 + 125 = 625
//        500 - 125 = 375