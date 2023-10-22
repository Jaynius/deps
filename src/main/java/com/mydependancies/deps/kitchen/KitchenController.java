package com.mydependancies.deps.kitchen;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitchenController {
    final KitchenService kitchen;
  
    public KitchenController(KitchenService kitchen) {
        this.kitchen = kitchen;
    }
    @GetMapping("/dishes")
     List<Dish> listDishes(){
        return this.kitchen.getDishes();
    }

    


}
