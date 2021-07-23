/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PlaceOrder;

import Business.Restaurant.FoodItems;
import java.util.ArrayList;

/**
 *
 * @author Pooja
 */
public class PlaceOrder {

private String OrderID;

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }
    private String RestaurantName;
    private String CustomerName;
    private String DeliveryMan;
    private ArrayList<FoodItems> PlaceOrder;
    private String Cost;
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

   
    private String DeliveryAddress;
    
    

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getDeliveryMan() {
        return DeliveryMan;
    }

    public void setDeliveryMan(String DeliveryMan) {
        this.DeliveryMan = DeliveryMan;
    }

    public ArrayList<FoodItems> getPlaceOrder() {
        return PlaceOrder;
    }

    public void setPlaceOrder(ArrayList<FoodItems> PlaceOrder) {
        this.PlaceOrder = PlaceOrder;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }
    @Override
    public String toString() {
        return OrderID;
    }
    
}
    

