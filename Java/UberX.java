public class UberX extends Car {
    //Atributos
    String brand;
    String model;

    //Constructor
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Marca: " + brand + " Modelo: " + model);
    }

}
