public enum Department {
    IT("IT"), SUPPORT("SUPPORT"), MANAGEMENT("MANAGEMENT"), UNKNOWN("UNKNOWN");
    private String description;

    Department(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
