package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.lang.ArithmeticException;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(6, 2);
        Divide(8,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.jav");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        ExtractFileName(studentFiles);
    }

    public static void Divide(int x, int y)
    {
        try {
            Double answer = (double) (x / y);
            System.out.println(answer);
        } catch (ArithmeticException e){
            System.out.println("You can not divide by 0.");

        }
    }

    public static int CheckFileExtension(String fileName) {
        String lastFive = "";
        String expected = ".java";

         if (fileName.length()>5) {
             lastFive = fileName.substring(fileName.length() - 5);
             if (lastFive.equalsIgnoreCase(expected)) {
                 return 1;
             } else {
                 return 0;
             }
         } else {
             if (fileName == null || fileName.equals("")) {
                 return -1;
             } else {
                 return 0;
             }
         }
    }

    private static void ExtractFileName(HashMap<String, String> students) {
        //String fileName = null;
        for (Map.Entry<String, String> student : students.entrySet()) {
            String fileName = student.getValue();
            String studentName = student.getKey();

            System.out.println("Name: "+studentName+", Score: "+CheckFileExtension(fileName));
        }
    }

}
