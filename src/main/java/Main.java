import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Employee employee = new Employee("Adam", "Janiczek", "87101404616", "IsdfadsfasT", 50000.00);
        File stats = new File("stats.txt");
        File file = new File("employees.csv");
        try (FileWriter fileWriter = new FileWriter(stats)) {
            if (file.exists()) {
                Employee[] employees = FileUtils.read(file);
                EmployeeStats employeeStats = new EmployeeStats(employees);
                fileWriter.write(employeeStats.toString());
            }
        }
    }
}
