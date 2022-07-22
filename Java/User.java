public class User extends Account {


    public User(String name, String document){
        super(name, document);
    }

    void printDataUser(){
        System.out.println("El conductor es: " + name + 
        " Y su identificación es: " + document);
    }
    
}
