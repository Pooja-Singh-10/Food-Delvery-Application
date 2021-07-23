/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author harold
 */

import Business.PlaceOrder.PlaceOrder;
import Business.Restaurant.FoodItems;
import java.util.ArrayList;


public class DeliveryMan {
    
    private String Name;
     private String UserName;
     private ArrayList<PlaceOrder> orderList;
     public void addOrder(String RestaurantName, String CustomerName, String DeliveryMan, ArrayList<FoodItems> Order, String Cost, String DeliveryAddress) {
        PlaceOrder placeorder=new PlaceOrder();
        //order.setOrder_id(String.valueOf(id));
        placeorder.setCustomerName(CustomerName);
        placeorder.setRestaurantName(RestaurantName);
        placeorder.setDeliveryMan(DeliveryMan);
        placeorder.setPlaceOrder(Order);
        placeorder.setCost(Cost);
        placeorder.setDeliveryAddress(DeliveryAddress);
        placeorder.setStatus("New Order");
        orderList.add(placeorder);
        
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

    public void setOrderList(ArrayList<PlaceOrder> placeorder) {
        this.orderList = placeorder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setDMNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return UserName;
    }
  
    
}
