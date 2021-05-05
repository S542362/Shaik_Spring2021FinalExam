/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author Shabnam Shaik
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String employeeName;
    private double empSalary;

    public Employee(int empId, String employeeName, double empSalary) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "empId:" + empId + " " + "employeeName:" + employeeName + " " + "empSalary:" + empSalary;
    }

    @Override
    public int compareTo(Employee emp) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int cmp = ((Integer) this.empId).compareTo(emp.empId);
        return cmp;

    }

}
