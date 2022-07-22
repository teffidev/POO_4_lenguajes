

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    //Atributos
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    //Constructor
    public UberBlack(String license, Account driver, 
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }  
    
}
