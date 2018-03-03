/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swproject02;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author utrgv
 */
public class TicketController {
    TicketModel ticketModel;
    TicketView ticketView;
    
    
    
    public TicketController(TicketModel ticketModel, TicketView ticketView)
    {
        this.ticketView = ticketView;
        this.ticketModel = ticketModel;
        attachHandlers();
    
    }
    
    public void attachHandlers()
    {
        ticketView.getClearAdd().setOnAction(e -> { 
            ticketView.clearAllAdd();
            });
        
        ticketView.getAddTicket().setOnAction(
            new EventHandler<ActionEvent>()
            {
            @Override
            public void handle(ActionEvent event)
            {
                String license = ticketView.getLicenseTF().getText();
                String state = ticketView.getStateTF().getText();
                String permitNo = ticketView.getPermitTF().getText();
                String make = ticketView.getMakeTF().getText();
                String model = ticketView.getModelTF().getText();
                String color = ticketView.getColorTF().getText();
                String date = ticketView.getDateTF().getText();
                String location = ticketView.getLocationTF().getText();
                String time = ticketView.getTimeTF().getText();
                String issue = ticketView.getIssueTF().getText();
            
                if(ticketView.getToggleOffense().equals(ticketView.getNoPermitToggle()))
                {
                    String offense = "No Permit";
                }
                else if(ticketView.getToggleOffense().equals(ticketView.getWrongSpotToggle()))
                {
                    String offense = "Wrong Spot";
                }    
                else if(ticketView.getToggleOffense().equals(ticketView.getBadParkingToggle()))
                {
                    String offense = "Bad Parking";
                }
                else
                {
                    String offense = "Please see police station";
                }
            
               
            }
            
        });

    ticketView.getPrintAll().setOnAction(e ->{
        for(int i = 0; i < ticketModel.ticketList.size(); i++)
        {
            ticketView.getPrintField().setText(ticketModel.ticketList.get(i).toString());
        }
    });
    
    
    
    }

   
   
    
}
