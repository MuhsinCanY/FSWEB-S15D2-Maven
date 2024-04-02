package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        StringBuilder num = new StringBuilder("str");

        System.out.println(num);
        some(num);
        System.out.println(num);
    }

    public static void some(StringBuilder i){
        i.append("mcy");
    }
}