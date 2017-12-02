


import java.util.ArrayList;
import java.util.Scanner;



public class Teacher {
    private static int mark;
    private static String name;
    public static ArrayList<Integer> marks = new ArrayList<Integer>();

    public Teacher() {


        for (int j = 0; j < Fackultet.students.size(); j++) {
            System.out.println("student: " + Fackultet.students.get(j));
            for (int k = 0; k < Fackultet.subjects.length; k++) {
                System.out.println("put any mark for the exam: " + Fackultet.subjects[k]);
                Scanner scanner = new Scanner(System.in);
                marks.add(setMark(scanner.nextInt()));

            }

        }

    }


    public static int getMark() {
        return mark;
    }

    public static Integer setMark(Integer mark) {
        return mark;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Teacher.name = name;
    }
}

