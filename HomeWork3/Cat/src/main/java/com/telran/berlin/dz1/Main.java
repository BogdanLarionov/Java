package com.telran.berlin.dz1;

public class Main {
    public static void main(String[] args) {

        char char1 = 'G';
        System.out.println(char1);


        int integer = 89;
        System.out.println(integer);

        byte byte1 = 4;
        System.out.println(byte1);

        short short1 = 56;
        System.out.println(short1);

        float float1 = 4.7333436f;
        System.out.println(float1);

        double double1 = 4.355453532;
        System.out.println(double1);

        long long1 = 12121;
        System.out.println(long1);

//1
        Cat myCat = new Cat();
        myCat.setBreed("Siamese");
        System.out.println(myCat.getBreed());
//2
        Cat myCat2 = new Cat();
        myCat2.setName("Sonya");
        System.out.println(myCat2.getName());
//3
        Cat myCat3 = new Cat();
        myCat3.setColor("Gray");
        System.out.println(myCat3.getColor());
//   4
        Cat myCat4 = new Cat();
        myCat4.setEyesColor("Rgeen");
        System.out.println(myCat4.getEyesColor());

//        5
        Cat myCat5 = new Cat();
        myCat5.setHair("Rgeen");
        System.out.println(myCat5.getHair());
//        6
        Cat myCat6 = new Cat();
        myCat6.setWeight(2);
        System.out.println(myCat6.getWeight());
//         7
        Cat myCat7 = new Cat();
        myCat7.setYears(5);
        System.out.println(myCat7.getYears());
    }
}



//        /*byte ageOfDaughter = 8;
//        System.out.println("Age of my Daughrter is" + " " + ageOfDaughter + " years");
//
//        short tractor = 495;
//        System.out.println("We've bought " + tractor + " new tractors");
//
//        int cars = 9;
//        String haveBroken = " Cars are broken";
//        System.out.println(cars + haveBroken);
//        cars = 10; ///???? не подменяет Ha 10 ??????
//
//        long camel = 999999999999l;
//        String camels = "A lot of camels :=) ";
//        byte rabbit = 5;
//        System.out.println(camels + camel + " and " + rabbit + " rabbits");
//
//        float a = 5.5f;
//        float b = 10.5f;
//        String answer = "Answer: ";
//        System.out.println(answer + (a + b));
//
//        double k = 55.5;
//        double h = 44.5;
//        String an = "double answer : ";
//        System.out.println(an + (k+h));
//
//        float q = 99.999f;
//        float w = 66.213f;
//        String ans = "Float answer : ";
//        System.out.println(ans+(q-w));
//
//
//        double c = 99.9;
//        float d = 15.4f;
//        String answer1 = "double + float answer: ";
//        System.out.println(answer1 + (c - d));
//
//        char letter = 'A';
//        System.out.println("From var byte " + ageOfDaughter);*/
