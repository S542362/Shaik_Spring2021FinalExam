/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11_example2;

import java.util.Objects;

/**
 *
 * @author Shabnam Shaik
 */
public class Student {

    private String grade;
    private String classStatus;

    /**
     *
     * @param grade student grade is given
     * @param classStatus of the student is given
     */
    public Student(String grade, String classStatus) {
        this.grade = grade;
        this.classStatus = classStatus;
    }

    /**
     *
     * @return will get grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     *
     * @param grade will set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     *
     * @return will get the classStatus
     */

    public String getClassStatus() {
        return classStatus;
    }

    /**
     *
     * @param classStatus is set
     */

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    /**
     * hashcode is overridden
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.grade);
        hash = 89 * hash + Objects.hashCode(this.classStatus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.grade, other.grade)) {
            return false;
        }
        if (!Objects.equals(this.classStatus, other.classStatus)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return toString method is overridden
     */

    @Override
    public String toString() {
        return "grade: " + grade + "\nclassStatus: " + classStatus;
    }

}
