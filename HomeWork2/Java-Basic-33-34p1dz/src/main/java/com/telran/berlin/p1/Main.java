package com.telran.berlin.p1;

import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        int a = 54;
        int b= 16;

        int c = 50;
        int d = 3;

        int e =  -5;
        int f = 8;
        int g = 6;

        int aa = 55;
        int bb = 9;
        int cc = 9;

        int box= 5;
        int squareBox = box*box;

//      int a1 = (a+b+c+d+e+f+g+h+i+j)/10;
//      int a2 = (a+b+c+d+e+f+g+h+i+j)%10;
//      System.out.println("Среднее арифметическое: " + result);
//      System.out.println("Остаток в дробной части: " + result2);

        int a1 = 0;
        int b1 = 1;
        int c1 = 2;
        int d1 = 3;
        int e1 = 4;
        int f1 = 5;
        int g1 = 6;
        int h1 = 7;
        int i1 = 8;
        int j1 = 9;
        int P = (a1+b1+c1+d1+e1+f1+g1+h1+i1+j1/10);

        int productA = 1000;
        int productB = 500;
        int tov3 = productA + productB;
        int discount = 100;
        int skid = (productA+productB) - discount;


        System.out.println(a+b);
        System.out.println(c/d);
        System.out.println(e+f*6);
        System.out.println((aa+9)%9);
        System.out.println(squareBox);
        System.out.println(P);
        System.out.println("Discount: "+discount);
        System.out.println("Your discount is: "+skid);



    }


}