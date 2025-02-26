package com.wipro.java.ms.l;

public class Main {
    public static void main(String[] args) {
        Birds parrot = new Parrot();
        ((Parrot) parrot).fly();
        parrot.eat();

        Birds penguin = new Penguin();
        ((Penguin) penguin).eat();
        
    }
}
