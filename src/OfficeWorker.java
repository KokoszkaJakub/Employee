import java.util.Date;

public class OfficeWorker extends Employee {
    final double amountPerHourOfficeWorker = 20;

    public OfficeWorker(String firstName, String lastName, String addressStreetAndNumber, String zipCodeAndCity, int age, int phoneNumber) {
        super(firstName, lastName, addressStreetAndNumber, zipCodeAndCity, age, phoneNumber);
    }


    @Override
    public double payment() {
        return getHoursWorked() * amountPerHourOfficeWorker;
    }

    @Override
    public String giveData() {
        return "My name is: " + getFirstName() + " " + getLastName() + " and i`m office employee"
                ;
    }
}

