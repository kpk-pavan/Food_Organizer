package com.example.food_organizer;
public class Customer { // customer class
   // fields for the user to create sn accout
    private String name;
    private String gender;
    private String phone;
    private String mail;
    private String userName;
    private String password;
    private String cPassword;
    private boolean box;

    // constructor for the class
    public Customer (String name, String gender, String phone, String mail, String userName, String password) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.mail = mail;
        this.userName = userName;
        this.password = password;
//        this.cPassword = cPassword;
//        this.box=box;

    }
    // default constructor
    public Customer(){

    }

    public Customer(String name, String phone, String mail, String userName) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.userName = userName;
    }
    // getters and setters for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }
}
