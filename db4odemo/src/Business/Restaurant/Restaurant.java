/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String adminUName;
    private ArrayList<FoodMenu> Menu;
    private ArrayList<Order> orderList;
    int id=101;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

  
    
     public void addOrder(String RestaurantName, String CustomerName, String DeliveryMan, ArrayList<FoodMenu> Order, String Cost, String DeliveryAddress) {
        Order order=new Order();
        order.setOrder_id(String.valueOf(id));
        order.setCustomerName(CustomerName);
        order.setRestaurentName(RestaurantName);
        order.setDeliverMan(DeliveryMan);
        order.setOrder(Order);
        order.setCost(Cost);
        order.setDeliveryAddress(DeliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    public ArrayList<FoodMenu> getMenu() {
        return Menu;
    }
    public void addDishes(FoodMenu menu){
        
        Menu.add(menu);
    }
    
    
    
    public void removeDishes(FoodMenu menu){
        
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
        Menu=new ArrayList<FoodMenu>();
        orderList=new ArrayList<Order>();
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
