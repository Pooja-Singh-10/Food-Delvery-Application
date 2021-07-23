/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author Pooja
 */
public class FoodItems {
    
    private String FoodName;
    private String FoodPrice;
    private String FoodDescription;

    public FoodItems(String FoodName,String FoodDescription,String FoodPrice) {
        this.FoodName=FoodName;
        this.FoodPrice=FoodPrice;
        this.FoodDescription=FoodDescription;
    }
    

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public String getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(String FoodPrice) {
        this.FoodPrice = FoodPrice;
    }

    public String getFoodDescription() {
        return FoodDescription;
    }

    public void setFoodDescription(String FoodDescription) {
        this.FoodDescription = FoodDescription;
    }
    @Override
    public String toString() {
        return FoodName;
    }
}


