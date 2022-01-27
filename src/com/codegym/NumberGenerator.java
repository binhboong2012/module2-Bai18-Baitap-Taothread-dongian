package com.codegym;

public class NumberGenerator implements Runnable{
    private String name;

    public NumberGenerator() {
        this.name = "";
    }

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int hashCode = this.hashCode();

        for (int i = 0; i < 11; i++) {
            System.out.println("i = " + i + ", hashcode= "+hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
