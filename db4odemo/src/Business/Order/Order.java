/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.FoodMenu;
import java.util.ArrayList;

/**
 *
 * @author chief_kmv
 */
public class Order {
    private String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
    private String restaurantName;
    private String customerName;
    private String deliveryMan;
    private ArrayList<FoodMenu> Order;
    private String cost;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    private String deliveryAddress;
    
    

    public String getRestaurentName() {
        return restaurantName;
    }

    public void setRestaurentName(String restaurentName) {
        this.restaurantName = restaurentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliverMan(String deliverMan) {
        this.deliveryMan = deliverMan;
    }

    public ArrayList<FoodMenu> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<FoodMenu> Order) {
        this.Order = Order;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    @Override
    public String toString() {
        return order_id;
    }
    
}
