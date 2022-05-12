package com.example.refuel1.dashboard;

import org.osmdroid.bonuspack.routing.Road;
import org.osmdroid.util.GeoPoint;

public class Response {
    public String address;
    public String exception;
    public GeoPoint fuelCoordinates;
    public Road road;
    public String orderId;
    public Boolean orderSavedToDatabase;
}
