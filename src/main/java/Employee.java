public class Employee {
    private String name;
    private String lastName;
    private String pesel;
    private Departments departments;
    private int salary;

    public Employee(String name, String lastName, String pesel, String department, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        departments = setDepartment(department);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Departments getDepartment() {
        return departments;
    }

    private Departments setDepartment(String department) {
        return switch (department.toUpperCase()) {
            case "IT":
                yield Departments.IT;
            case "SUPPORT":
                yield Departments.SUPPORT;
            case "MANAGEMENT":
                yield Departments.MANAGEMENT;
            default:
                yield Departments.UNKNOWN;
        };
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
