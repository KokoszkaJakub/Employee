public class Test {
    
    public static void main(String[] args) {
        WarehouseWorker adamKovalsky = new WarehouseWorker("Adam", "Kovalsky", "Jaminowa 2", "32-700 Bochnia",
                32, 666432765);
        adamKovalsky.setHoursWorked(5.75);
        adamKovalsky.payment();
        System.out.println(adamKovalsky.giveData());

        System.out.println(adamKovalsky.payment());

        OfficeWorker andrzejPietruszka = new OfficeWorker("Andrzej", "Pietruszka", "Kolorowa 3", "51-180 Wrocław",
                44, 615261432);
        andrzejPietruszka.setHoursWorked(1.25);
        System.out.println(andrzejPietruszka.payment());
        System.out.println(andrzejPietruszka.giveData());


    }

}
