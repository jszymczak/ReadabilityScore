class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        return "".equals(this.firstName) && "".equals(this.lastName)
                ? "Unknown" : "".equals(this.firstName)
                ? this.lastName : "".equals(this.lastName)
                ? this.firstName : this.firstName + " " + this.lastName;
    }
}