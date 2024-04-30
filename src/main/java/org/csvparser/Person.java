package org.csvparser;

public class Person {
    private int id;
    private String name;
    private Gender gender;
    private String birthDate;
    private Division division;
    private int salary;

    Person(int id, String name, Gender gender, String birthDate, Division division, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Division getDivision() {
        return division;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate=" + getBirthDate() +
                ", division='" + division + '\'' +
                ", salary=" + salary +
                '}';
    }
}
