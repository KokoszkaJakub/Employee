public class Program {

    public static void main(String[] args) {
        WarehouseWorker adamKovalsky = new WarehouseWorker("Adam", "Kovalsky", "Jaminowa 2", "32-700 Bochnia",
                32, 666432765, "bus");
        adamKovalsky.setHoursWorked(5.75);

        System.out.println(adamKovalsky.giveData());



        OfficeWorker andrzejPietruszka = new OfficeWorker("Andrzej", "Pietruszka", "Kolorowa 3", "51-180 Wrocław",
                44, 615261432);
        andrzejPietruszka.setHoursWorked(8.50);

        System.out.println(andrzejPietruszka.giveData());
    }

}
