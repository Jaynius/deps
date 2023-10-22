package com.mydependancies.deps.kitchen;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class KitchenService {


/*
* Generates a list of random dish(es).
*/
List<Dish> getDishes() {
return Arrays.asList(randomDish());
}
/**
* Randomly pick the next dish.
*/
private Dish randomDish() {
return this.menu.get(picker.nextInt(3));
}
private List<Dish> menu = Arrays.asList( //
new Dish("Sesame chicken"), //
new Dish("Lo mein noodles, plain"), //
new Dish("Sweet & sour beef"));
private Random picker = new Random();
}
