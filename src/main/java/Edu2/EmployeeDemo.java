package Edu2;

/**
 * Created by janaidu on 19/12/2016.
 */

public class EmployeeDemo {
        public static void main(String[] args) {

            class Employee {
                String name;
                String ssn;
                String emailAddress;
                int yearOfBirth;                 // class

                void setYearOfBirth(int year) {
                    yearOfBirth = year;
                    year = -1;      // modify local variable copy

                }
            }

            Employee e1 = new Employee();          //object
            e1.name = "John";
            e1.ssn = "555-12-345";
            e1.emailAddress = "john@company.com";

            Employee e2 = new Employee();           //object
            e2.name = "Tom";
            e2.ssn = "456-78-901";
            e2.yearOfBirth = 1974;

            System.out.println("Name: " + e1.name);
            System.out.println("SSN: " + e1.ssn);
            System.out.println("Email Address: " + e1.emailAddress);
            System.out.println("Year Of Birth: " + e1.yearOfBirth);

            System.out.println("Name: " + e2.name);
            System.out.println("SSN: " + e2.ssn);
            System.out.println("Email Address: " + e2.emailAddress);
            System.out.println("Year Of Birth: " + e2.yearOfBirth);

        }
    }

