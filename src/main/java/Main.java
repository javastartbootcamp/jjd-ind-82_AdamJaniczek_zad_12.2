import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Employee employee = new Employee("Adam", "Janiczek", "87101404616", "IsdfadsfasT", 50000.00);
        Employee[] employees = FileUtils.read("employees.csv");
        EmployeeStats employeeStats = new EmployeeStats(employees);
        System.out.println(employeeStats.toString());
    }
}
