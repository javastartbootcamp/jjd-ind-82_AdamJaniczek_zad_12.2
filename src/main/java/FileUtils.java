import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtils {

    static Employee[] read(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        Employee[] result = new Employee[lines];
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            String name = split[0];
            String lastName = split[1];
            String pesel = split[2];
            String department = split[3];
            int salary = Integer.valueOf(split[4]);
            result[i] = new Employee(name, lastName, pesel, department, salary);
        }
        return result;
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }
}
