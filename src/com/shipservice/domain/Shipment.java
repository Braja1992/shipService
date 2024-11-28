package com.shipservice.domain;

import java.util.Date;

public class Shipment {
    private String resourceId;
    private Order order;
    private ShipmentLocation location;
    private Date shipmentDate;
    private Date expiredDate;
    private String deliveryText;
    private Date deliveryDate;
    private String trackingNumber;
    private Double chargeAmount;
    
    public String getResourceId() {
        return resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    public Order getOrder() {
        return order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
    public ShipmentLocation getLocation() {
        return location;
    }
    
    public void setLocation(ShipmentLocation location) {
        this.location = location;
    }
    
    public Date getShipmentDate() {
        return shipmentDate;
    }
    
    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }
    
    public Date getExpiredDate() {
        return expiredDate;
    }
    
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
    
    public String getDeliveryText() {
        return deliveryText;
    }
    
    public void setDeliveryText(String deliveryText) {
        this.deliveryText = deliveryText;
    }
    
    public Date getDeliveryDate() {
        return deliveryDate;
    }
    
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    public String getTrackingNumber() {
        return trackingNumber;
    }
    
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    
    public Double getChargeAmount() {
        return chargeAmount;
    }
    
    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
}