package beans;

import util.InputUtil;

public class Teacher {

    private String name;
    private String surname;
    private int age;
    private String faculty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Teacher(String name, String surname, int age, String faculty) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.faculty = faculty;
    }

    public Teacher() {

    }

    public String getFullInfo() {
        return this.name + " " + this.surname
                + " " + this.age + " " + this.faculty;
    }
}
