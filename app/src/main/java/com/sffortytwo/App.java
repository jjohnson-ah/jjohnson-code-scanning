/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.sffortytwo;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    private static String password = "abc123";

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        String username = "scott";
        try {
            DriverManager.getConnection("", username, password);
        } catch (SQLException sqle) {
            System.out.println("There was an error");
        }

        Student student = new Student();
        student.doSomething();

    }
}
