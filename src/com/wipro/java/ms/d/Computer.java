package com.wipro.java.ms.d;

class Computer {
    private InputDevice device; // ✅ Depends on abstraction

    // Constructor Injection
    public Computer(InputDevice device) {
        this.device = device;
    }

    void use() {
        device.input();
    }
}

