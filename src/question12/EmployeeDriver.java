/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Shabnam Shaik
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here
        ArrayList<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(15, "mastanvali shaik", 10113.67));
        employee.add(new Employee(10, "razia shaik", 90087.98));
        employee.add(new Employee(03, "saajidah shaik", 80097.76));
        employee.add(new Employee(07, "syed shaik", 11234.05));
        employee.add(new Employee(11, "chandini shaik", 13421.54));
        System.out.println("SHABNAM SHAIK");
        System.out.println("Employees in actual order:");
        for (Employee s : employee) {

            System.out.println(s);
        }
        System.out.println();

        // Sort the employees into natural order by emp id
        Collections.sort(employee);
        System.out.println("Sorting by employee id: ");
        for (Employee s : employee) {
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(employee, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() < e2.getEmpSalary()) {
                    return -1;
                } else if (e1.getEmpSalary() == e2.getEmpSalary()) {
                    return 0;
                } else {
                    return +1;
                }
            }
        });
        System.out.println("Sorted by Salary in increasing order: ");
        for (Employee s : employee) {
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(employee, new Comparator<Employee>() {
            public int compare(Employee s1, Employee s2) {

                return (s1.getEmployeeName()).compareTo(s2.getEmployeeName());
            }
        });
        System.out.println("Sorted Employees by name: ");
        for (Employee s : employee) {
            System.out.println(s);
        }
        System.out.println();

    }

}
