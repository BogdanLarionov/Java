package com.telran.berlin.game.hero;

import com.telran.berlin.game.constant.Constant;

public class Elf {
    private long id;
    private String name;
    private boolean gender;
    private int level;
    private int fortune;
    private int power;
    private int charisma;
    private int magic;

    public Elf() {

    }

    public Elf(long id) {   //        Конструктор  метод 2
        this.id = id;   //        Конструктор
        this.power = Constant.ELF_POWER;  //        Конструктор
        this.charisma = Constant.ELF_CHARISMA;  //        Конструктор
        this.magic = Constant.ELF_MAGIC;   //        Конструктор

    }

//    public Elf(long id, int power, int charisma, int magic) {//        Конструктор метод 1
//        this.id = id;    //        Конструктор
//        this.power = power;//        Конструктор
//        this.charisma = charisma;//        Конструктор
//        this.magic = magic;//        Конструктор
//    }


    public long getId() { //пустой конструктор
        return id; //пустой конструктор
    } //пустой конструктор

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}