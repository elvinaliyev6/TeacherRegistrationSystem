package main;

import beans.Teacher;
import java.util.Scanner;
import util.InputUtil;
import util.TeacherUtil;

public class Main {

    public static void main(String[] args) {
        int menu=0;
        while (true) {
            System.out.println("what do you want to do?"
                    + "\n1.Register Teacher"
                    + "\n2.Show all teachers"
                    + "\n3.Find Teacher"
                    + "\n4.Update teacher"
                    + "\n5.Exit");
            Scanner sc = new Scanner(System.in);
             menu = sc.nextInt();
            if (menu == 1) {
                TeacherUtil.registerTeacher();
            } else if (menu == 2) {
                TeacherUtil.printAllRegisteredTeachers();
            } else if (menu == 3) {
                TeacherUtil.findStudent();
            } else if (menu == 4) {
                TeacherUtil.updateTeacher();
            }
            else if(menu==5){
                System.exit(0);
            }

        }

    }

}
