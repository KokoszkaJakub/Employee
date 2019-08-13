public class WarehouseWorker extends Employee {
    /**
     * name of vehicle ex. car, bus, tir
     */
    String typeOfDrivingLicense;

final double amountPerHourWarehouseWorker = 15;

    public WarehouseWorker(String firstName, String lastName, String addressStreetAndNumber, String zipCodeAndCity, int age, int phoneNumber,
                           String typeOfDrivingLicense) {
        super(firstName, lastName, addressStreetAndNumber, zipCodeAndCity, age, phoneNumber);
        this.typeOfDrivingLicense = typeOfDrivingLicense;
    }



    @Override
    public double payment() {
        return getHoursWorked() * amountPerHourWarehouseWorker;
    }

    @Override
    public String giveData() {
        return "My name is: " + getFirstName() + " " + getLastName() + " and i`m warehouse employee, my payment are: " + payment() +
                " i have driving license, i can drive " + typeOfDrivingLicense
                ;
    }
}

