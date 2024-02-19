public class EmployeeStats {
    private Employee[] employees;

    public EmployeeStats(Employee[] employees) {
        this.employees = employees;
    }

    private int minSalary() {
        int minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                minSalary = employees[i].getSalary();
            } else {
                minSalary = Math.min(minSalary, employees[i].getSalary());
            }
        }
        return minSalary;
    }

    private int maxSalary() {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                maxSalary = employees[i].getSalary();
            } else {
                maxSalary = Math.max(maxSalary, employees[i].getSalary());
            }
        }
        return maxSalary;
    }

    private double averageSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.length;
    }

    @Override
    public String toString() {
        return "Średnia wypłata: " + averageSalary() + "\n" +
                "Minimalna wypłata: " + minSalary() + "\n" +
                "Maksymalna wypłata: " + maxSalary() + "\n";
    }
}
