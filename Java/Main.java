

class Main {
    public static void main(String[] args) {        
        System.out.println("----Hola Mundo----");
        /*Car car = new Car("AMQ123", new Account("Pedro Herrera", 
        "AND123"));
        car.setPassenger(3);
        car.printDataCar(); //Reutilizamos el método que hicimos en la Clase Car.*/


        //Encapsulamiento
        UberX uberx = new UberX("QWE567", new Account("Andrea Herrera", 
        "CPN564"), "Chevrolet", "Sonic");
        uberx.setPassenger(4);
        uberx.printDataCar();

        /*UberPool uberpool = new UberPool("XKX32E", new Account("Karla Andrade", 
        "CNPJ500"), "Mazda", "323");
        uberpool.setPassenger(4);
        uberpool.printDataCar();*/

        UberVan ubervan = new UberVan("EWQ547", new Account("Carlos Lopez", 
        "DNI0147"));
        ubervan.setPassenger(6);
        ubervan.printDataCar();
        
        
    }
}




