package org.launchcode;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        try {
            Divide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            try {
                int points = CheckFileExtension(studentFiles.get(student));
                System.out.println(student + ": " + points + " points");
            } catch (InvalidFileException ex) {
                System.out.println(student + ": " + ex.getMessage());
            }
        }
    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return x / y;
    }

  public static int CheckFileExtension(String fileName) throws InvalidFileException {
        if (fileName == null || fileName.isEmpty()) {
            //throw new InvalidFileException("File name is null or empty.");
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
    class InvalidFileException extends Exception {
        public InvalidFileException(String message) {
            super(message);
        }
}
}