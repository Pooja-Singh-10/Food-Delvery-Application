/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author harold
 */

import Business.PlaceOrder.PlaceOrder;
import java.util.ArrayList;

public class Restaurant {
    
    private String adminUName;
    private ArrayList<FoodItems> Menu;
    private ArrayList<PlaceOrder> orderList;
    int id=101;

    public ArrayList<PlaceOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<PlaceOrder> orderList) {
        this.orderList = orderList;
    }

  
    
     public void addOrder(String RestaurantName, String CustomerName, String DeliveryMan, ArrayList<FoodItems> PlaceOrder, String Cost, String DeliveryAddress) {
        PlaceOrder order=new PlaceOrder();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(CustomerName);
        order.setRestaurantName(RestaurantName);
        order.setDeliveryMan(DeliveryMan);
        order.setPlaceOrder(PlaceOrder);
        order.setCost(Cost);
        order.setDeliveryAddress(DeliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    public ArrayList<FoodItems> getMenu() {
        return Menu;
    }
    public void addDishes(FoodItems menu){
        
        Menu.add(menu);
    }
    
    
    
    public void removeDishes(FoodItems menu){
        
        Menu.remove(menu);
    }

    
    
    public String getAdminUName() {
        return adminUName;
    }

    

    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }

    public Restaurant(String UName) {
        this.adminUName=UName;
        Menu=new ArrayList<FoodItems>();
        orderList=new ArrayList<PlaceOrder>();
    }
    
  
    private String name;
    private String address;
    private String number;

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
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
  
    
}
