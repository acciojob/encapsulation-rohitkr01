package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "accio";  // gives error
        obj.setter("Accio");
        System.out.println( obj.getter());
    }
  
}