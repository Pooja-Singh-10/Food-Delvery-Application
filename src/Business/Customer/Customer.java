/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author harold
 */


import Business.PlaceOrder.PlaceOrder;
import Business.Restaurant.FoodItems;
import java.util.ArrayList;

public class Customer {
    
     int id=101;
    private String Name;
     private String UserName;
      private ArrayList<PlaceOrder> orderList;
     public void addOrder(String RestaurantName, String CustomerName, String DeliveryMan, ArrayList<FoodItems> Order, String Cost, String DeliveryAddress) {
        PlaceOrder placeorder=new PlaceOrder();
        placeorder.setOrderID(String.valueOf(id));
        placeorder.setCustomerName(CustomerName);
        placeorder.setRestaurantName(RestaurantName);
        placeorder.setDeliveryMan(DeliveryMan);
        placeorder.setPlaceOrder(Order);
        placeorder.setCost(Cost);
        placeorder.setDeliveryAddress(DeliveryAddress);
        placeorder.setStatus("New Order");
        orderList.add(placeorder);
        id++;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    private String address;
    private String number;

    public Customer(String UserName){
        this.UserName=UserName;
        orderList=new ArrayList<PlaceOrder>();
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<PlaceOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<PlaceOrder> order) {
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

    
    
}
