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

public class CustomerDirectory {
    
    private ArrayList<Customer> CustomerList;
   
    private Customer customer;
    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }
    
    
    
    public void setCustomerList(ArrayList<Customer> CustomerList) {
        this.CustomerList = CustomerList;
    }
    
    
    
    public CustomerDirectory(){
        this.CustomerList=new ArrayList<Customer>();
    }
    
    
    
    public Customer createCustomer(String uName){
        customer= new Customer(uName);
        CustomerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<CustomerList.size();i++){
            if(CustomerList.get(i).getUserName().equals(username)){
                CustomerList.remove(i);
            }
        }
    }
  
    
}
