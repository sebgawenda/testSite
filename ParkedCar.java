/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swproject02;

/**
 *
 * @author admin
 */
public class ParkedCar {
    
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPermitNo() {
        return permitNo;
    }
    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getIssuedBy() {
        return issuedBy;
    }
    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
    
    private String license;
    private String state;
    private String permitNo;
    private String make;
    private String model;
    private String color;
    private String date;
    private String location;
    private String time;
    private String issuedBy;

    public String getOffense() {
        return offense;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }
    private String offense;
  
    
    @Override
    public String toString() {
        return "License: " + license + ", State: " + state 
                + ", Permit No.: " + permitNo + ", Make: " + make + ", Model: " 
                + model + ", Color: " + color + ", Date: " + date + ", Location: " 
                + location + ", Time: " + time + ", Issued By: " + issuedBy
                + "Offense" + offense;
    }
    
}
