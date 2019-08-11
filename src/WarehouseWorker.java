public class WarehouseWorker extends Employee {
    /**
     * name of vehicle ex. car, bus, tir
     */
    String typeOfDrivingLicense;

final double amountPerHourWarehouseWorker = 15;

    public WarehouseWorker(String firstName, String lastName, String addressStreetAndNumber, String zipCodeAndCity, int age, int phoneNumber) {
        super(firstName, lastName, addressStreetAndNumber, zipCodeAndCity, age, phoneNumber);
    }


    @Override
    public double payment() {
        return getHoursWorked() * amountPerHourWarehouseWorker;
    }

    @Override
    public String giveData() {
        return "My name is: " + getFirstName() + " " + getLastName() + " and i`m warehouse employee"
                ;
    }
}

