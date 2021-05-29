
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIDO
 */
public class MainChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<TitanicPassenger> allPassengers = new ArrayList<TitanicPassenger> ();
        Methods x = new Methods();
        allPassengers = x.getPassengersFromJsonFile();
       // x.graphPassengerClass(allPassengers);
       // x.graphPassengerAges(allPassengers);
       //x.graphPassengersurvived(allPassengers);
       x.graphPassengersurvivedGender(allPassengers);
    }
    
}
