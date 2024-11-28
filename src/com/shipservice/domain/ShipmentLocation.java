package com.shipservice.domain;

public class ShipmentLocation {
    private String firstName;
    private String lastName;
    private PostalAddress postalAddress;
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }
    
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }
}