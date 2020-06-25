/*
Project: Car Dealership Team Project
Purpose Details: A text-based car dealership system
Course: IST 242
Author: Elyse Swider
Date Developed: 6/13/2020
Last Date Changed: 6/21/2020
Revision: 2
 */
package com.company;
import java.util.Date;
import java.util.Scanner;

public class User { 
    private Integer idNumber; 
    private String FName; 
    private String LName; 
    private Date Birthday; 
    private String Address; 
    private Integer PhoneNumber; 
    private Integer SSN; 
    private Boolean Active; 
} 

public class Customers inherits User {
        // setters and getters
        public void setIdNumber() {
            this.idNumber = idNumber;
        }
        public Integer getidNumber() {
            return idNumber;
        }
        public void setFName () {
            this.FName = FName;
        }
        public String getFName () {
            return FName;
        }
        public void setLName () {
            this.LName = LName;
        }
        public String getLName() {
            return LName;
        }
        public void setBirthday(){
            this.Birthday = Birthday;
        }
        public Date getBirthday() {
            return Birthday;
        }
        public void setPhoneNumber() {
            this.PhoneNumber = PhoneNumber;
        }
        public Integer getPhoneNumber() {
            return PhoneNumber;
        }
        public void setAddress() {
            this.Address = Address;
        }
        public String getAddress() {
            return Address;
        }
        public void setSSN(){
            this.SSN = SSN;
        }
        public Integer getSSN() {
             return SSN;
        }
        public void setActive() {
            this.Active = Active;
        }
        public Boolean getActive() {
            return Active;
        }
        public void Information(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Please Enter your Name");
        }
    }
}
}
