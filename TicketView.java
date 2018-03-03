/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swproject02;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


/**
 *
 * @author admin
 */
public class TicketView extends GridPane{
   //private Button enterPrintfromMain = new Button("Print Tickets");
     //private Button enterAddfromPrint = new Button("Add Tickets");
    //private Button enterPrint = new Button("Print Tickets");
    //private Button exitAdd = new Button("Exit");
    
    private Label mainLabel = new Label("Main Screen");
    private Button enterAdd = new Button("Add Ticket");
    
    private Button exitProgram = new Button("Exit");
    private Label printLabel = new Label("Print Screen");  
    private TextArea printField = new TextArea("");
    private Button printAll = new Button("Print All");
    private Button scrollLeft = new Button("<<");
    private Button scrollRight = new Button(">>");
    private Button exitPrint = new Button("Exit");
    private Label addLabel = new Label("Add Screen");
    private Label licenseLB = new Label("License:");
    private TextField licenseTF = new TextField();
    private Label stateLB = new Label("State:");
    private TextField stateTF = new TextField();
    private Label permitLB = new Label("Permit #:");
    private TextField permitTF = new TextField();
    private Label makeLB = new Label("Make:");
    private TextField makeTF = new TextField();
    private Label modelLB = new Label("Model:");
    private TextField modelTF = new TextField();
    private Label colorLB = new Label("Color:");
    private TextField colorTF = new TextField();
    private Label dateLB = new Label("Date:");
    private TextField dateTF = new TextField();
    private Label locationLB = new Label("Location:");
    private TextField locationTF = new TextField();
    private Label timeLB = new Label("time:");
    private TextField timeTF = new TextField();
    private Label issueLB = new Label("Issued By:");
    private TextField issueTF = new TextField();
    private Button clearAdd = new Button("Clear");
    
    private ToggleGroup toggleOffense = new ToggleGroup();
    private RadioButton noPermitToggle = new RadioButton("No Permit");
    private RadioButton wrongSpotToggle = new RadioButton("Wrong Spot");
    private RadioButton badParkingToggle = new RadioButton("Bad Parking");
    private VBox offenseBox = new VBox(10, noPermitToggle, wrongSpotToggle, badParkingToggle);
    private Button addTicket = new Button("Add Ticket");

    public TicketView(){            //col row
        this.setConstraints(licenseLB, 0, 0);
        this.setConstraints(licenseTF, 1, 0);
        this.setConstraints(stateLB, 2, 0);
        this.setConstraints(stateTF, 3, 0);
        this.setConstraints(permitLB, 4, 0);
        this.setConstraints(permitTF, 5, 0);
        this.setConstraints(makeLB, 0, 1);
        this.setConstraints(makeTF, 1, 1);
        this.setConstraints(modelLB, 2, 1);
        this.setConstraints(modelTF, 3, 1);
        this.setConstraints(colorLB, 4, 1);
        this.setConstraints(colorTF, 5, 1);
        this.setConstraints(dateLB, 0, 2);
        this.setConstraints(dateTF, 1, 2);
        this.setConstraints(locationLB, 2, 2);
        this.setConstraints(locationTF, 3, 2);
        this.setConstraints(timeLB, 4, 2);
        this.setConstraints(timeTF, 5, 2);
        VBox offenseBox = new VBox(10, noPermitToggle, wrongSpotToggle, badParkingToggle);
        this.setConstraints(offenseBox, 0, 4);
        this.setConstraints(enterAdd, 0, 5);
        this.setConstraints(printAll, 1, 5);
        this.setConstraints(printField, 6, 6);
        
        this.getChildren().addAll(licenseLB, licenseTF, stateLB, stateTF, permitLB, permitTF,
                makeLB, makeTF, modelLB, modelTF, colorLB, colorTF, dateLB, dateTF, locationLB, 
                locationTF, timeLB, timeTF, offenseBox, enterAdd, printAll, printField);
        
    }
    
    
    
    public void clearAllAdd()
    {
            licenseTF.clear();
            stateTF.clear();
            permitTF.clear();
            makeTF.clear();
            modelTF.clear();
            colorTF.clear();
            dateTF.clear();
            locationTF.clear();
            timeTF.clear();
            issueTF.clear();  
    }
    
    public void updateTicketView(ArrayList<ParkedCar> ticketList){
        String license ="";
        String state = "";
        String permit = "";
        String make = "";
        String model = "";
        String color = "";
        String date = "";
        String location = "";
        String time = "";
        String issue = "";
        String offense = "";
        String list = "";
        
        for (int i = 0; i < ticketList.size(); i++)
        {
            ParkedCar current = (ParkedCar) ticketList.get(i);
            
            license = current.getLicense();
            state = current.getState();
            permit = current.getPermitNo();
            make = current.getMake();
            model = current.getModel();
            color = current.getColor();
            date = current.getDate();
            location = current.getLocation();
            time = current.getTime();
            issue = current.getIssuedBy();
            offense = current.getOffense();
            
            list += "License: " + license + ", State: " + state 
                + ", Permit No.: " + permit + ", Make: " + make + ", Model: " 
                + model + ", Color: " + color + ", Date: " + date + ", Location: " 
                + location + ", Time: " + time + ", Issued By: " + issue
                + "Offense" + offense;
            
        }
        
      
      
        
    
    }
    
    
    
    
    
    public Label getMainLabel() {
        return mainLabel;
    }

    public void setMainLabel(Label mainLabel) {
        this.mainLabel = mainLabel;
    }

    public Button getEnterAdd() {
        return enterAdd;
    }

    public void setEnterAdd(Button enterAdd) {
        this.enterAdd = enterAdd;
    }

    public Button getExitProgram() {
        return exitProgram;
    }

    public void setExitProgram(Button exitProgram) {
        this.exitProgram = exitProgram;
    }

    public Label getPrintLabel() {
        return printLabel;
    }

    public void setPrintLabel(Label printLabel) {
        this.printLabel = printLabel;
    }

    public TextArea getPrintField() {
        return printField;
    }

    public void setPrintField(TextArea printField) {
        this.printField = printField;
    }

    public Button getPrintAll() {
        return printAll;
    }

    public void setPrintAll(Button printAll) {
        this.printAll = printAll;
    }

    public Button getScrollLeft() {
        return scrollLeft;
    }

    public void setScrollLeft(Button scrollLeft) {
        this.scrollLeft = scrollLeft;
    }

    public Button getScrollRight() {
        return scrollRight;
    }

    public void setScrollRight(Button scrollRight) {
        this.scrollRight = scrollRight;
    }

    public Button getExitPrint() {
        return exitPrint;
    }

    public void setExitPrint(Button exitPrint) {
        this.exitPrint = exitPrint;
    }

    public Label getAddLabel() {
        return addLabel;
    }

    public void setAddLabel(Label addLabel) {
        this.addLabel = addLabel;
    }

    public Label getLicenseLB() {
        return licenseLB;
    }

    public void setLicenseLB(Label licenseLB) {
        this.licenseLB = licenseLB;
    }

    public TextField getLicenseTF() {
        return licenseTF;
    }

    public void setLicenseTF(TextField licenseTF) {
        this.licenseTF = licenseTF;
    }

    public Label getStateLB() {
        return stateLB;
    }

    public void setStateLB(Label stateLB) {
        this.stateLB = stateLB;
    }

    public TextField getStateTF() {
        return stateTF;
    }

    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    public Label getPermitLB() {
        return permitLB;
    }

    public void setPermitLB(Label permitLB) {
        this.permitLB = permitLB;
    }

    public TextField getPermitTF() {
        return permitTF;
    }

    public void setPermitTF(TextField permitTF) {
        this.permitTF = permitTF;
    }

    public Label getMakeLB() {
        return makeLB;
    }

    public void setMakeLB(Label makeLB) {
        this.makeLB = makeLB;
    }

    public TextField getMakeTF() {
        return makeTF;
    }

    public void setMakeTF(TextField makeTF) {
        this.makeTF = makeTF;
    }

    public Label getModelLB() {
        return modelLB;
    }

    public void setModelLB(Label modelLB) {
        this.modelLB = modelLB;
    }

    public TextField getModelTF() {
        return modelTF;
    }

    public void setModelTF(TextField modelTF) {
        this.modelTF = modelTF;
    }

    public Label getColorLB() {
        return colorLB;
    }

    public void setColorLB(Label colorLB) {
        this.colorLB = colorLB;
    }

    public TextField getColorTF() {
        return colorTF;
    }

    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    public Label getDateLB() {
        return dateLB;
    }

    public void setDateLB(Label dateLB) {
        this.dateLB = dateLB;
    }

    public TextField getDateTF() {
        return dateTF;
    }

    public void setDateTF(TextField dateTF) {
        this.dateTF = dateTF;
    }

    public Label getLocationLB() {
        return locationLB;
    }

    public void setLocationLB(Label locationLB) {
        this.locationLB = locationLB;
    }

    public TextField getLocationTF() {
        return locationTF;
    }

    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    public Label getTimeLB() {
        return timeLB;
    }

    public void setTimeLB(Label timeLB) {
        this.timeLB = timeLB;
    }

    public TextField getTimeTF() {
        return timeTF;
    }

    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    public Label getIssueLB() {
        return issueLB;
    }

    public void setIssueLB(Label issueLB) {
        this.issueLB = issueLB;
    }

    public TextField getIssueTF() {
        return issueTF;
    }

    public void setIssueTF(TextField issueTF) {
        this.issueTF = issueTF;
    }

    public Button getClearAdd() {
        return clearAdd;
    }

    public void setClearAdd(Button clearAdd) {
        this.clearAdd = clearAdd;
    }

    public ToggleGroup getToggleOffense() {
        return toggleOffense;
    }

    public void setToggleOffense(ToggleGroup toggleOffense) {
        this.toggleOffense = toggleOffense;
    }

    public RadioButton getNoPermitToggle() {
        return noPermitToggle;
    }

    public void setNoPermitToggle(RadioButton noPermitToggle) {
        this.noPermitToggle = noPermitToggle;
    }

    public RadioButton getWrongSpotToggle() {
        return wrongSpotToggle;
    }

    public void setWrongSpotToggle(RadioButton wrongSpotToggle) {
        this.wrongSpotToggle = wrongSpotToggle;
    }

    public RadioButton getBadParkingToggle() {
        return badParkingToggle;
    }

    public void setBadParkingToggle(RadioButton badParkingToggle) {
        this.badParkingToggle = badParkingToggle;
    }

    public VBox getOffenseBox() {
        return offenseBox;
    }

    public void setOffenseBox(VBox offenseBox) {
        this.offenseBox = offenseBox;
    }

    public Button getAddTicket() {
        return addTicket;
    }

    public void setAddTicket(Button addTicket) {
        this.addTicket = addTicket;
    }
    
    
    
}
