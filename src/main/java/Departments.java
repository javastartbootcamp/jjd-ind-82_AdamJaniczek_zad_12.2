public enum Departments {
    IT("IT"), SUPPORT("SUPPORT"), MANAGEMENT("MANAGEMENT"), UNKNOWN("UNKNOWN");
    private String description;

    Departments(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
