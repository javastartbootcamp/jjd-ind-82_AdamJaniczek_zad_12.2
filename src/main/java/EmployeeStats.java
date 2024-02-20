public class EmployeeStats {
    private Employee[] employees;

    public EmployeeStats(Employee[] employees) {
        this.employees = employees;
    }

    private int minSalary() {
        if (employees.length == 0) {
            return 0;
        }

        int minSalary = employees[0].getSalary();

        for (int i = 1; i < employees.length; i++) {
            int currentSalary = employees[i].getSalary();
            if (currentSalary < minSalary) {
                minSalary = currentSalary;
            }
        }

        return minSalary;
    }

    private int maxSalary() {
        if (employees.length == 0) {
            return 0;
        }

        int maxSalary = employees[0].getSalary();

        for (int i = 1; i < employees.length; i++) {
            int currentSalary = employees[i].getSalary();
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary;
            }
        }

        return maxSalary;
    }

    private int averageSalary() {
        if (employees.length == 0) {
            return 0;
        }

        int totalSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        return (int) ((double) totalSalary / employees.length);
    }

    public int countEmployees() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getDepartment());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Średnia wypłata: " + averageSalary() + "\n" +
                "Minimalna wypłata: " + minSalary() + "\n" +
                "Maksymalna wypłata: " + maxSalary() + "\n";
    }
}
