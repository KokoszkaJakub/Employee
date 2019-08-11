public abstract class Employee {
    private String firstName;
    private String lastName;
    private String addressStreetAndNumber;
    private String zipCodeAndCity;
    private int age;
    private int phoneNumber;
    private double hoursWorked;

    public abstract double payment() ;
    public abstract String giveData();



    public Employee(String firstName, String lastName, String addressStreetAndNumber, String zipCodeAndCity, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressStreetAndNumber = addressStreetAndNumber;
        this.zipCodeAndCity = zipCodeAndCity;
        this.age = age;
        this.phoneNumber = phoneNumber;


    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
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

    public String getAddressStreetAndNumber() {
        return addressStreetAndNumber;
    }

    public void setAddressStreetAndNumber(String addressStreetAndNumber) {
        this.addressStreetAndNumber = addressStreetAndNumber;
    }

    public String getZipCodeAndCity() {
        return zipCodeAndCity;
    }

    public void setZipCodeAndCity(String zipCodeAndCity) {
        this.zipCodeAndCity = zipCodeAndCity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;


}}

