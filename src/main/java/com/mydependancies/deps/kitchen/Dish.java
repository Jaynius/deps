package com.mydependancies.deps.kitchen;

public class Dish {
private String description;
private boolean delivered=false;
public Dish(String description2) {
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}

public static Dish deliver(Dish dish){
   
    Dish deliveredDish = new Dish(dish.description);
    deliveredDish.delivered = true;
return deliveredDish;
    
}
public boolean isDelivered(){
    return delivered;
}
@Override
public String toString() {
    return "Dish [description=" + description + ", delivered=" + delivered + "]";
}

}
