package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(2,3);

        int resultAdd = calculator.add(2, 3);
        int resultSubstract = calculator.substract(2, 3);

        if ((resultAdd == (calculator.getA() + calculator.getB()) &&
            resultSubstract == (calculator.getB() - calculator.getA()))) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        }
    }

