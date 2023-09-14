package PilasConArreglos;

import PilasConArreglos.tests.StackTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class");

    StackTest stackTest = new StackTest();
    stackTest.testStackInteger();
    stackTest.testStackString();

    }
}
