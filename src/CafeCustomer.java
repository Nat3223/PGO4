public class CafeCustomer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // getters
    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // toString
    @Override
    public String toString() {
        return "CafeCustomer{id=" + customerId +
                ", name='" + firstName + " " + lastName +
                "', email='" + email + "'}";
    }

    // equals (compare by id OR email)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CafeCustomer)) return false;

        CafeCustomer other = (CafeCustomer) obj;
        return this.customerId == other.customerId ||
                this.email.equals(other.email);
    }
}