/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.FoodMenu;
import java.util.ArrayList;

/**
 *
 * @author kmv
 */
public class DeliveryMan {
     private String Name;
     private String UserName;
     private ArrayList<Order> orderList;
     public void addOrder(String RestaurantName, String CustomerName, String DeliveryMan, ArrayList<FoodMenu> Order, String Cost, String DeliveryAddress) {
        Order order=new Order();
        //order.setOrder_id(String.valueOf(id));
        order.setCustomerName(CustomerName);
        order.setRestaurentName(RestaurantName);
        order.setDeliverMan(DeliveryMan);
        order.setOrder(Order);
        order.setCost(Cost);
        order.setDeliveryAddress(DeliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    private String address;
    private String number;

    public DeliveryMan(String UserName){
        this.UserName=UserName;
        orderList=new ArrayList<Order>();
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> order) {
        this.orderList = order;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return UserName;
    }
    
}
