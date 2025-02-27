package com.wipro.java.ms.d;

public class Main {
    public static void main(String[] args) {
        
        Computer keyboardComputer = new Computer(new Keyboard());
        keyboardComputer.use(); // Typing on the keyboard...

        
        Computer mouseComputer = new Computer(new Mouse());
        mouseComputer.use(); //Clicking the mouse...
    }
}
