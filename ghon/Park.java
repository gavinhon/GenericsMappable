package com.ghon;

public class Park extends Point{
    private String parkName;
    public Park(String parkName, String location) {
        super(location);
        this.parkName = parkName;
    }

    @Override
    public String toString(){
        return parkName + " National Park";
    }
}
