package homework5;

import java.util.*;

public class Init {

    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Person1> people = new ArrayList<Person1>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isWorking = true;
        int step = 0;

        System.out.println("Object creator");
        System.out.println("========================");

        while (isWorking) {
            System.out.println("Choose an option: create/next/exit");
            String option = scan.nextLine().toLowerCase();
            if (option.equals("exit")) {
                isWorking = false;
                break;
            }
            if (option.equals("next")) {
                if (step == 2) {
                    step = 0;
                } else {
                    step++;
                }
                if (step == 0) {
                    System.out.println("==== Creating employees ====");
                } else if (step == 1) {
                    System.out.println("==== Creating students ====");
                } else if (step == 2) {
                    System.out.println("==== Creating persons ====");
                }
                continue;
            }
            if (option.equals("create")) {
                // TODO: Remove these variables
                String name, gender;
                int age, id;
                switch (step) {
                    // Employee
                    case 0:
                        System.out.print("Name: ");
                        name = scan.next();
                        System.out.print("Age: ");
                        age = scan.nextInt();
                        System.out.print("Gender: ");
                        gender = scan.next();
                        System.out.print("ID: ");
                        id = scan.nextInt();
                        System.out.print("Salary: ");
                        double salary = scan.nextDouble();

                        Employee employee = new Employee(name, age, gender.charAt(0), id, salary);
                        employees.add(employee);
                        break;
                    // Student
                    case 1:
                        System.out.print("Name: ");
                        name = scan.next();
                        System.out.print("Age: ");
                        age = scan.nextInt();
                        System.out.print("Gender: ");
                        gender = scan.next();
                        System.out.print("ID: ");
                        id = scan.nextInt();
                        System.out.println("GPA: ");
                        double gpa = scan.nextDouble();

                        Student student = new Student(name, age, gender.charAt(0), id, gpa);
                        students.add(student);
                        break;
                    // Person1
                    case 2:
                        System.out.print("Name: ");
                        name = scan.next();
                        System.out.print("Age: ");
                        age = scan.nextInt();
                        System.out.print("Gender: ");
                        gender = scan.next();

                        Person1 person = new Person1(name, age, gender.charAt(0));
                        people.add(person);
                        break;
                }
            }
            System.out.println("Reached the end of the loop");
            // This fixes the problem of the loop repeating itself
            scan.nextLine();
        }
        scan.close();
        if (employees.size() > 0) {
            System.out.println(employees.toString());
        }
        if (students.size() > 0) {
            System.out.println(students.toString());
        }
        if (people.size() > 0) {
            System.out.println(people.toString());
        }
        System.out.println("Goodbye!");
    }
}