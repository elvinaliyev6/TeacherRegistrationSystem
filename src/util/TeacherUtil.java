/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Teacher;
import main.Config;

/**
 *
 * @author Elvin Aliyev
 */
public class TeacherUtil {

    public static Teacher fillTeacher() {
        String name = InputUtil.requireText("Enter name: ");
        String surname = InputUtil.requireText("Enter surname: ");
        int age = InputUtil.requireNumber("Enter age: ");
        String faculty = InputUtil.requireText("Enter faculty");
        Teacher t = new Teacher(name, surname, age, faculty);
        return t;
    }

    public static void registerTeacher() {
        int count = InputUtil.requireNumber("How many teacher will registrate?");
        Config.teachers = new Teacher[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " registration");
            Teacher t = TeacherUtil.fillTeacher();
            Config.teachers[i] = t;
        }
        printAllRegisteredTeachers();
    }

    public static void printAllRegisteredTeachers() {
        if(Config.teachers==null)
            return;
        
        for (int i = 0; i < Config.teachers.length; i++) {
            Teacher t = Config.teachers[i];
            System.out.println((i + 1) + " " + t.getFullInfo());
        }
    }

    public static void findStudent() {
        String text = InputUtil.requireText("Enter name, surname or faculty");
        for (int i = 0; i < Config.teachers.length; i++) {
            Teacher t = Config.teachers[i];
            if (t.getName().contains(text)
                    || t.getSurname().contains(text)
                    || t.getFaculty().contains(text)) {
                System.out.println(t.getFullInfo());
            }
        }
    }

    public static void updateTeacher() {
        int i = InputUtil.requireNumber("necenci adamda deyisiklik etmek isteyirsiz?");
        Teacher t = TeacherUtil.fillTeacher();
        Config.teachers[i - 1] = t;
    }
}
