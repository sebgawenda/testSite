/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import swproject02.TicketView;
import swproject02.TicketModel;
import swproject02.TicketController;


/**
 *
 * @author utrgv
 */
public class ticketMVC extends Application{
    
        TicketView ticketView = new TicketView();
        TicketModel ticketModel = new TicketModel();
        TicketController tc = new TicketController(ticketModel, ticketView);
        
        
    
    @Override
    public void start(Stage primaryStage){
       
        
        
        primaryStage.setOnCloseRequest(e ->{
            e.consume();
        });
    
    
    
    
    Scene ticketScreen = new Scene(ticketView, 1000, 1000);
    primaryStage.setTitle("Ticket Citation Program");
    primaryStage.setScene(ticketScreen);
    
    primaryStage.show();
        
    }
    
    
    public static void main(String[] args) {
       
        launch(args);
    }
    
}
