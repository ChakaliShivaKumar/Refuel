package com.example.refuel1.interfaces;

import com.example.refuel1.profile.orders.Order;

import java.util.ArrayList;

public interface LoadOrderListCallback{
    public void onResponse(ArrayList<Order> orders, String exception);
}
