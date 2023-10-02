package com.example.restaurant;

import com.example.restaurant.model.Restaurant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantApllicationUnitTest {

    @Test
    void testCreateTable() {
        Restaurant restaurant = Restaurant.createRestaurant();
        System.out.println(restaurant);
        assertEquals(4, restaurant.getTables().size());
    }
}
