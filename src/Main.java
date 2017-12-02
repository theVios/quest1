import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("input stdent name");
        Student.setName(Fackultet.students.add(scanner.nextLine()));
        Fackultet.exam();
        System.out.println("you pass all exam");
        scanner.nextLine();
        System.out.println("input teacher name");
        Teacher.setName(scanner.nextLine());
        new Teacher();
        Fackultet.averageMark();
        if (Fackultet.getAverageMark()>3){
            System.out.println("your go to university");
            System.out.println("student-  "+Fackultet.students.get(0));
            System.out.println("teacher-  "+ Teacher.getName());
            System.out.println("avereage mark-  " + Fackultet.getAverageMark());
            System.out.println("exam marks-  ");
            for (int i = 0; i<Fackultet.subjects.length; i++){

                System.out.println(Fackultet.subjects[i] +":"+ Teacher.marks.get(i));
            }
        }
        else {
            System.out.println("you do NOT go to university");
            System.out.println("student-  "+ Fackultet.students.get(0));
            System.out.println("teacher-  "+ Teacher.getName());
            System.out.println("averege mark-  " + Fackultet.getAverageMark());
            System.out.println("exam marks-  ");
            for (int i = 0; i<Fackultet.subjects.length; i++){
                System.out.println(Fackultet.subjects[i] +":"+ Teacher.marks.get(i));
            }
        }
    }
}
