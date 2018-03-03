/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swproject02;
import java.util.ArrayList;
import javafx.scene.layout.GridPane;


/**
 *
 * @author admin
 */
public class TicketModel extends GridPane {
    ArrayList<ParkedCar> ticketList = new ArrayList<>();
    ParkedCar currentTicket = new ParkedCar();
    
    public void setCurrentTicket(ParkedCar currentTicket)
    {
        this.currentTicket = currentTicket;
        ticketList.add(currentTicket);
    }
    
    public ParkedCar getCurrentTicket()
    {
        return currentTicket;
    }
    
    public ArrayList<ParkedCar> getCurrentTickets()
    {
        return ticketList;
    }
    
   
}
