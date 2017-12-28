package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("OK");
        } else {
            System.out.println("not OK");
        }

        //Testing Class Calculator
        Calculator calculator = new Calculator();
        int addResult = calculator.add(2,3);
        int subResult = calculator.substract(1,3);

        if (addResult == 5 && subResult == 2) {
            System.out.println("calculator test ok");
        } else {
            System.out.println("calculator test failure");
        }

    }
}

