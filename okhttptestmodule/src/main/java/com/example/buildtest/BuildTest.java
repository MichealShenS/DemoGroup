package com.example.buildtest;

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/9/4 14:15
 * Description:
 */
class BuildTest {

    Computer.Builder builder = new Computer.Builder();

    Computer computer = new Computer.Builder()
            .setCpu("Intel Core i7")
            .setMotherboard("GIGABYTE Z97")
            .setDisplayCard("GTX Titan")
            .setRam("32G")
            .setDisk("2TB")
            .setPower("1000W")
            .build();

    Person person = new Person.Builder()
            .setAge(13)
            .build();
}
