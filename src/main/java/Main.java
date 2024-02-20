import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Employee employee = new Employee("Adam", "Janiczek", "87101404616", "IsdfadsfasT", 50000.00);
        File file = new File("employees.csv");
        if (file.exists()) {
            Employee[] employees = FileUtils.read(file);
            EmployeeStats employeeStats = new EmployeeStats(employees);
            File stats = new File("stats.txt");
            FileWriter fileWriter = new FileWriter(stats);
            fileWriter.write(employeeStats.toString());
            fileWriter.close();
        }
    }
}
