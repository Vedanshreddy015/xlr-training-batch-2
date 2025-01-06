public class employee {
    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private String address;


    public employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    
    public employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        employee emp1 = new employee();
        emp1.setFirstName("Vedansh");
        emp1.setLastName("reddy");
        System.out.println("Employee 1 Full Name: " + emp1.getFullName());

    
        employee emp2 = new employee(2, "kammari", "chari", "123 Main St");
        System.out.println("employee 2 Full Name: " + emp2.getFullName());
    }
}