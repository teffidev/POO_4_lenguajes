public class Driver extends Account {

    public Driver(String name, String document) {
        super(name, document);
    }

    void printDataDriver(){
        System.out.println("El conductor es: " + name + 
        " Y su identificación es: " + document);
    }
    
}
