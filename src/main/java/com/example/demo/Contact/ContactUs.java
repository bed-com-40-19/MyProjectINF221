package com.example.demo.Contact;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class ContactUs {
    private String name;
    private String email;
    private String message;
    private int noOfProducts;

    public ContactUs(){

    }
    public ContactUs(String  name, String email, String message, int noOfProducts){
          this.name = name;
          this.email = email;
          this.message = message;
          this.noOfProducts = noOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNoOfProducts() {
        return noOfProducts;
    }

    public void setNoOfProducts(int noOfProducts) {
        this.noOfProducts = noOfProducts;
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", noOfProducts=" + noOfProducts +
                '}';
    }
}
