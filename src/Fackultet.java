import java.util.ArrayList;
import java.util.Scanner;

public class Fackultet {
    public static int averageMark;
    public static  String[] subjects = {"math", "gitHub", "java"};
    public static ArrayList<String> students = new ArrayList<String>();


    public Fackultet(String[] subjects, int averageMark) {
        this.averageMark = averageMark;
        this.subjects = subjects;
        exam();
    }

    public static void averageMark(){
        for (int i = 0; i<Teacher.marks.size(); i++){
            setAverageMark(getAverageMark()+Teacher.marks.get(i));
        }
        setAverageMark(getAverageMark()/Teacher.marks.size());
    }

    public static void exam(){
        for (int i =0; i<subjects.length; i++){
            System.out.println("press any num to win(to pass the exam)");
            System.out.println(subjects[i]);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("you win(pass)");
            }
        }

    }

    public static int getAverageMark() {
        return averageMark;
    }

    public static void setAverageMark(int averageMark) {
        Fackultet.averageMark = averageMark;
    }
}
